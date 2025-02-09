package day0531;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import kr.co.sist.dao.MyBatisDAO;
import kr.co.sist.domain.EmpDomain;
import kr.co.sist.vo.CpEmpVO;
import kr.co.sist.vo.EmployeeVO;

public class ExamMapper7DAO {

  private static ExamMapper7DAO em7DAO = null;

  private ExamMapper7DAO() {

  }// ExamMapper4DAO

  public static ExamMapper7DAO getInstance() {
    if (em7DAO == null) {

      em7DAO = new ExamMapper7DAO();

    } // end if

    return em7DAO;
  }// getInstance

  public List<EmpDomain> dynamicForeach(HashMap<String, Object> map) throws PersistenceException {
    List<EmpDomain> list = null;
    // 1. MyBatis Handler 얻기
    MyBatisDAO mbDAO = MyBatisDAO.getInstance();
    SqlSession ss = mbDAO.getMyBatisHandler(false);
    // 2. 쿼리 수행 후 결과 얻기
    list = ss.selectList("kr.co.sist.exam6.dynamicForeach", map);
    // 3. MyBatis Handler 닫기
    mbDAO.closeHandler(ss);
    return list;
  }// dynamicIf2

  public int dynamicUpdate(CpEmpVO ceVO) throws PersistenceException {
    int cnt = 0;

    // 1. MyBatis Handler 얻기
    MyBatisDAO mbDAO = MyBatisDAO.getInstance();
    SqlSession ss = mbDAO.getMyBatisHandler(true);
    // 2. 쿼리 수행 후 결과 얻기
    cnt = ss.update("kr.co.sist.exam6.dynamicSet", ceVO);
    // 3. MyBatis Handler 닫기
    mbDAO.closeHandler(ss);

    return cnt;
  }// dynamicUpdate

  public void procedureInsert(EmployeeVO eVO) throws PersistenceException {

    // 1. MyBatis Handler 얻기
    MyBatisDAO mbDAO = MyBatisDAO.getInstance();
    SqlSession ss = mbDAO.getMyBatisHandler(true);
    // 2. 쿼리 수행 후 결과 얻기
    ss.selectOne("kr.co.sist.exam6.procedureInsert", eVO);
    // 3. MyBatis Handler 닫기
    mbDAO.closeHandler(ss);

  }

  public List<EmpDomain> selectProcedure(int deptno) throws PersistenceException {
    List<EmpDomain> list = new ArrayList<EmpDomain>();

    // 1. MyBatis Handler 얻기
    MyBatisDAO mbDAO = MyBatisDAO.getInstance();
    SqlSession ss = mbDAO.getMyBatisHandler(true);
    // 2. 쿼리 수행 후 결과 얻기
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("deptno", deptno);
    ss.selectOne("kr.co.sist.exam6.selectDeptEmp", map);

    // 3. MyBatis Handler 닫기
    mbDAO.closeHandler(ss);

    // 조회 결과가 map에 저장 ( selectEmp, msg )
    // System.out.println(map.get("selectEmp"));
    // System.out.println(map.get("msg"));

    EmpDomain ed = null;
    List<Map<String, Object>> searchList = (List<Map<String, Object>>) map.get("selectEmp");

    for (Map<String, Object> searchMap : searchList) {
      ed = new EmpDomain();
      // String, BigDecimal, Timestamp가 나온다.
      ed.setEname((String) searchMap.get("ENAME"));
      ed.setJob((String) searchMap.get("JOB"));
      ed.setSal(((BigDecimal) searchMap.get("SAL")).intValue());
      ed.setHiredate(new Date(((Timestamp) searchMap.get("HIREDATE")).getTime()));

      list.add(ed);

    }

    return list;
  }

  public static void main(String[] args) {
    // HashMap<String, Object> map = new HashMap<String, Object>();
    // map.put("deptno", 10);
    // String[] jobs = "salesman,clerk, manager, president".split(",");
    // map.put("jobList", jobs);

    // ExamMapper7DAO.getInstance().dynamicForeach(map);
    // CpEmpVO ceVO = new CpEmpVO();
    // ceVO.setEmpno(7566);
    // ceVO.setEname("김동");
    // ceVO.setSal(3000);
    // ceVO.setJob("사원");
    // ExamMapper7DAO.getInstance().dynamicUpdate(ceVO);

    // EmployeeVO eVO = new EmployeeVO();
    // eVO.setEmpno(2424);
    // eVO.setEname("양수민");
    // eVO.setSal(2424);
    // eVO.setJob("개발자");

    // ExamMapper7DAO.getInstance().procedureInsert(eVO);

    // System.out.println(eVO);

    // ExamMapper7DAO.getInstance().selectProcedure(10);
    System.out.println(ExamMapper7DAO.getInstance().selectProcedure(10));

  }

}// class
