<%@page import="admin.order.OrderDetailGoodsVO"%>
<%@page import="java.util.List"%>
<%@page import="admin.order.OrderDetailInfoVO"%>
<%@page import="admin.order.AdminOrderDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" info=""%>
<jsp:useBean id="orderInfo" class="admin.order.OrderDetailInfoVO" />
<jsp:setProperty property="*" name="orderInfo" />
<%
Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");

if (!Boolean.TRUE.equals(isLoggedIn)) {
%>
  <script type="text/javascript">
      alert('로그인이 필요합니다.');
      window.location.href = 'http://localhost/manage/adminLogin/adminLogin.jsp';
  </script>
<%
  return;
}
%>
<%
	AdminOrderDAO adminOrderDAO = AdminOrderDAO.getInstance();
	String paramId = (String)request.getParameter("id");
	if(request.getParameter("id") != null){
		orderInfo = adminOrderDAO.selectDetailInfo(paramId);
	} else {
%>
	<script>
		alert("잘못된 요청입니다. 주문 리스트 페이지로 돌아갑니다.");
		location.href = "http://localhost/manage/order/orders.jsp";
	</script>
<%
	}
	List<OrderDetailGoodsVO> goodsList = adminOrderDAO.selectDetailGoods(paramId);
%>
<!DOCTYPE html>
<html>
<head>
<jsp:include page="../../assets/jsp/admin/lib.jsp" />
<link rel="stylesheet" href="http://demofran.com/admin/css/admin.css?ver=20240430173216">
<link rel="shortcut icon" href="http://demofran.com/data/banner/JnLfWUSUyR6sXJP5n3Re4Fvdc93k93.ico" type="image/x-icon">
<script type="text/javascript">
	$(function() {
		$("#order_menu").addClass("bg-gradient-primary");
		
		$(".order_status").click(function(){
			var params = { 
					method: $(this).val(),
					cartId: <%= paramId %>,
					quantity: getAmount()
					};
			
			if(params.method == "반품접수" && $("#purchaseStatus").text() == "구매확정"){
				alert("구매 확정된 상품은 반품처리가 불가합니다.");
				return;
			}
			
			$.ajax({
				url: "status_update_process.jsp",
				type: "POST",
				datatype: "JSON",
				data: params,
				error: function(xhr){
					alert("error occurred");
				},
				success: function(result){
					if(result.flag){
						var $tbody = $("#sodr_list tbody");
						var goodsList = result.data;
						var output = "";
						
						$tbody.empty();
						$.each(goodsList, function(i, goods){
							output ="";
							output += "<tr class='list0'>";
							output += "<td><a href='http://localhost/goods/detail.jsp?goods=" + goods.code +"'>";
							output += "<img src='http://localhost/assets/images/goods/" + goods.defaultImage + "' width='40' height='40'></a></td>";
							output += "<td class='tal'><a href='http://localhost/goods/detail.jsp?goods=" + goods.code + "'>" + goods.name + "</a></td>";
							output += "<td>" + goods.orderStatus + "</td>";
							output += "<td id='purchaseStatus'>" + goods.purchaseStatus + "</td>";
							output += "<td id='goodsAmount'>" + goods.amount + "개</td>";
							output += "<td class='tar'>" + goods.price + "원</td>";
							output += "<td class='tar'>" + goods.deliveryCharge + "원</td>";
							output += "<td class='td_price'>" + (parseInt(goods.price) * parseInt(goods.amount) + parseInt(goods.deliveryCharge)) + "원</td></tr>";
							$tbody.append(output);
						});
						
						if(params.method == "반품접수"){
							if($("#purchaseStatus").text() == "구매확정"){
								alert("구매 확정된 상품은 반품처리가 불가합니다.");
								return;
							}
							alert("해당 상품의 반품 접수가 완료되었습니다.");
						} else{
							alert("해당 상품의 배송 상태가 변경되었습니다.");
						}
					}
				}
			});
		});
	});
	
	function getAmount(){
		var totalAmount = 0;
	    
	    $('#sodr_list tr').each(function(index, row){
	        if(index !== 0){
	            var columns = $(row).find('td');
	            
	            // 특정 컬럼(나이)의 데이터를 추출하여 합칩니다.
	            var amount = parseInt($(columns[4]).text().slice(0, -1));
	            totalAmount += amount;
	        }
	    });
	    
	    return totalAmount;
	}
</script>
<!-- golgolz start -->
<script src="http://demofran.com/js/jquery-1.8.3.min.js"></script>
<script src="http://demofran.com/js/jquery-ui-1.10.3.custom.js"></script>
<script src="http://demofran.com/js/common.js?ver=20240430173216"></script>
<script src="http://demofran.com/js/categorylist.js?ver=20240430173216"></script>
<style>
.new_win {
    overflow: auto; 
}
.status-btn-div {
	margin:10px;
	margin-left: 15px;
}
</style>
<!-- golgolz end -->
</head>
<body>
	
	<jsp:include page="../../assets/jsp/admin/header.jsp" />
	<main
		class="main-content position-relative max-height-vh-100 h-100 border-radius-lg ps--active-y">
		<nav
			class="navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl"
			id="navbarBlur" data-scroll="true">
			<div class="container-fluid py-1 px-3">
				<nav aria-label="breadcrumb">
					<ol
						class="breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5">
						<li class="breadcrumb-item text-sm"><a
							class="opacity-5 text-dark" href="javascript:;"> 관리자 기능</a></li>
						<!-- 하단의 대시보드 텍스트를 본인 기능으로 변경 필요  -->
						<li class="breadcrumb-item text-sm text-dark active"
							aria-current="page">주문 관리</li>
					</ol>
					<h6 class="font-weight-bolder mb-0">주문상세조회</h6>
				</nav>
			</div>
		</nav>
		<div class="container-fluid py-4">
			<!-- golgolz start -->
			<div id="sodr_pop" class="new_win">
				<section id="anc_sodr_list">
					<h4 class="anc_tit">주문상품 목록</h4>
					<div class="local_desc02 local_desc">
						<p style="font-size: 13px;">
							주문번호 : <%= orderInfo.getCartId() %>
						</p>
						<p style="font-size: 13px;">
							주문자ID : <%= orderInfo.getCustomerId() %>
						</p>
						<p style="font-size: 13px;">
							주문일시 : <%= orderInfo.getInputDate() %>
						</p>
					</div>
					<form name="frmorderform" method="post">
						<div class="tbl_head01">
							<table id="sodr_list">
								<colgroup>
									<col class="w60">
									<col>
									<col class="w90">
									<col class="w90">
									<col class="w60">
									<col class="w70">
									<col class="w70">
									<col class="w70">
								</colgroup>
								<thead>
									<tr>
										<th scope="col">이미지</th>
										<th scope="col">주문상품</th>
										<th scope="col">주문상태</th>
										<th scope="col">구매현황</th>
										<th scope="col">수량</th>
										<th scope="col">상품금액</th>
										<th scope="col">배송비</th>
										<th scope="col">실결제액</th>
									</tr>
								</thead>
								<tbody class="list">
									<% for(OrderDetailGoodsVO goods : goodsList){ %>
									<tr class="list0">
											<td>
												<a href="http://localhost/goods/detail.jsp?goods=<%= goods.getCode() %>">
													<img src="http://localhost/assets/images/goods/<%= goods.getDefaultImage() %>" width="40" height="40">
												</a>
											</td>
											<td class="tal">
												<a href="http://localhost/goods/detail.jsp?goods=<%= goods.getCode() %>">
													<%= goods.getName() %>
												</a>
											</td>
											<td><%= goods.getOrderStatus() %></td>
											<td id="purchaseStatus"><%= goods.getPurchaseStatus() %></td>
											<td id="goodsAmount"><%= goods.getAmount() %>개</td>
											<td class="tar"><%= goods.getPrice() %>원</td>
											<td class="tar"><%= goods.getDeliveryCharge() %>원</td>
											<td class="td_price"><%= goods.getPrice() * goods.getAmount() + goods.getDeliveryCharge() %>원</td>
									</tr>
									<% } %>
								</tbody>
							</table>
						</div>
					</form>
				</section>
				<section>
					<form name="buttonfrm">
						<div class="status-btn-div">
							<input type="button" value="배송시작" class="btn_medium blue order_status">
							<input type="button" value="배송완료" class="btn_medium green order_status">
							<input type="button" value="반품접수" class="btn_medium red order_status">
						</div>
					</form>
				</section>
				<div id="result_container">
					<section id="anc_sodr_pay" class="new_win_desc mart30">
						<h3 class="anc_tit">결제상세정보 확인</h3>
						<form name="frmorderreceiptform" action="./pop_orderformupdate.php"
							method="post" autocomplete="off">
							<input type="hidden" name="od_id" value="24040511530204">
							<input type="hidden" name="mod_type" value="receipt">
							<div class="compare_wrap">
								<section id="anc_sodr_chk" class="compare_center">
									<div class="tbl_frm01">
										<table>
											<colgroup>
												<col class="w150">
												<col>
											</colgroup>
											<tbody>
												<tr>
													<th scope="row">총 주문금액</th>
													<td class="td_price"><%= orderInfo.getPurchaseAmount() %>원</td>
												</tr>
												<tr>
													<th scope="row">총 상품금액</th>
													<td class="td_price bg0"><%= orderInfo.getPurchaseAmount() %>원</td>
												</tr>
												<tr>
													<th scope="row">총 배송비</th>
													<td class="td_price fc_197">(+) 3,000원</td>
												</tr>
												<tr>
													<th scope="row">실 결제금액</th>
													<td class="td_price bg0"><%= orderInfo.getPurchaseAmount() + 3000 %>원</td>
												</tr>
											</tbody>
										</table>
									</div>
								</section>
							</div>
						</form>
					</section>
					<section id="anc_sodr_addr">
						<h3 class="anc_tit">배송지 정보</h3>
						<form name="frmorderform2" action="./pop_orderformupdate.php" method="post">
							<input type="hidden" name="od_id" value="24040511530204">
							<input type="hidden" name="mod_type" value="info">
							<div class="compare_wrap">
								<section id="anc_sodr_taker" class="compare_left">
									<div class="tbl_frm01">
										<table>
											<colgroup>
												<col class="w100">
												<col>
											</colgroup>
											<tbody>
												<tr>
													<th scope="row"><label for="b_name">수령인</label></th>
													<td>
														<input type="text" name="b_name" value="<%= orderInfo.getReceiver() %>"
														id="b_name" required="" class="frm_input required"
														style="background-position: right top; background-repeat: no-repeat;">
													</td>
												</tr>
												<tr>
													<th scope="row"><label for="b_cellphone">핸드폰</label></th>
													<td>
														<input type="text" name="b_cellphone"
														value="<%= orderInfo.getReceiverTel() %>" id="b_cellphone" required=""
														class="frm_input required"
														style="background-position: right top; background-repeat: no-repeat;">
													</td>
												</tr>
												<tr>
													<th scope="row">주소</th>
													<td>
														<label for="b_zip" class="sound_only">우편번호</label>
														<input type="text" name="b_zip" value="06235" id="b_zip" required="" class="frm_input required" size="5" maxlength="5"
														style="background-position: right top; background-repeat: no-repeat;">
														<button type="button" class="btn_small grey"
															onclick="win_zip('frmorderform2', 'b_zip', 'b_addr1', 'b_addr2', 'b_addr3', 'b_addr_jibeon');">주소검색</button>
														<br> 
														<input type="text" name="b_addr1"
														value="<%= orderInfo.getDefaultAddr() %>" id="b_addr1" required=""
														class="frm_input required" size="35"
														style="background-position: right top; background-repeat: no-repeat;">
														<label for="b_addr1">기본주소</label>
														<br>
														<input type="text" name="b_addr2" value="<%= orderInfo.getAdditionalAddr() %>" id="b_addr2" class="frm_input" size="35"> 
														<label for="b_addr2">상세주소</label>
														<br>
														<br>
														<input type="hidden" name="b_addr_jibeon" value="R">
													</td>
												</tr>
												<tr>
													<th scope="row">전달 메세지</th>
													<td><%= orderInfo.getRequest() %></td>
												</tr>
											</tbody>
										</table>
									</div>
								</section>
							</div>
							<div class="btn_confirm">
								<a href="javascript:history.back();" class="btn_medium bx-white">이전</a>
							</div>
						</form>
					</section>
				</div>
			</div>
			<!-- golgolz end -->
		</div>
	</main>
</body>
</html>