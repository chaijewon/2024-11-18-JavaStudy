package com.sist.main;
/*
 *   추상 클래스 
 *    = 미완성 클래스 : 자신이 메모리 할당을 할 수 없다 
 *      ------------ 
 *      abstract class A => A a=new A(); 오류 발생 
 *      => 상속을 내려서 상속받은 클래스를 미완성된 메소드를 구현 해서 사용 
 *      => 사용 방법 
 *      abstract class A
 *      class B extends A
 *      ------------------ A a=new B() : 묵시적 형변환 
 *                                       ----------
 *                                       자동 형변환 
 *      => 미구현 => 구현 => 오버라이딩 : 생성자타입을 따라간다 
 *      
 *      => 추상 클래스 
 *         기능이 여러가지인 경우 : 프로그램에 맞게 구현 
 *         ----------------- 
 *         마우스 : 업체 => 운영체제에 맞게 구현 
 *                       MS사에서 제공하는 추상 클래스를 구현 
 *         -------------------------------------------
 *      => 데이터베이스의 모든 클래스는 추상클래스로 만들어져 있다 
 *         => 개발자가 데이터베이스에 맞게 구현 
 *         => 오라클 / MySQL / MariaDB ....
 *                   ---------------- DB2
 *         => SQL문장은 표준화 (데이터형 , 함수)
 *      => 추상클래스 형식 
 *         public abstract class ClassName
 *         {
 *              변수 / 생성자 => 극히 드물다 
 *              -----------------------
 *              표준 메소드 => 구현해서 사용 
 *              -----------------------
 *              선언된 메소드 => 추상메소드 
 *              => 프로그램에 따라 다른 구현을 해야 될때 
 *              => public abstract 리턴형 메소드명(매개변수..);
 *                        -------- 
 *              
 *              메소드는 {} 무조건 구현됨 
 *              
 *         }
 *         
 *      1.클래스마다 같은 메소드 => 따라 구현해야 될때 
 *      2.필요시마다 구현 해야되는 메소드 
 *        ------------------------- 오버라이딩 
 *      3. 멤버변수도 가지고 있다 
 *      4. 메모리 할당은 반드시 상속받은 클래스를 이용한다 
 *      5. 관련된 클래스를 모아서 관리  
 *      6. 미완성 클래스 (메소드구현이 없는 경우) 
 *      
 *      추상메소드가 없을 수 있다 
 *      --------------------
 *      abstract class ClassName => 클래스 연결 
 *      {
 *         
 *      }
 *      
 *      => 단일 상속 => 다중 상속 
 *      => 변수 => 상수 
 *      => 기본 => 다른 클래스에 영향이 없게 만드는 클래스 
 *      => 추상 클래스 => 발전 : 인터페이스 
 *      => 라이블러리 => 추상클래스 확인 
 *                    -------------
 *                    녹색 > 흰색 C C위에 A
 *      
 */
public class 추상클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
