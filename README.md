# java_basic

<h1>Ⅰ. 프로그래밍 언어와 자바</h1>
<h2>1. 자바 설치 및 개발환경 구축</h2>
<h3>1) JDK(Java Developement Kit) 설치</h3>
<h3>2) 환경 변수 등록</h3>
<h4> - 시스템 변수에서 변수이름 : JAVA_HOME 으로 변수값 : jdk가 설치되어 있는 경로로 설정</h4>
<h4> - Path 환경 변수 수정, 변수 값 %JAVA_HOME%\bin</h4>
<h4> - bin폴더 안의 javac 명력어와 컴파일된 파일을 실행해주는 java 명령어를 사용하기 위함</h4>
<h3>3) cmd창에서 javac -version으로 설치 확인</h3>
<h3>4) Eclipse IDE 설치
<br>
<br>

<h1>Ⅱ. 변수와 타입</h1>
  <h2>1. 변수</h2>
  <h4> - 변수는 값을 저장할 수 있는 메모리의 특정 번지에 붙이는 이름, ex) int x; int x = 10;...</h4>
  <h4> - 작성 규칙 </h4>
  <table>
    <tr>
      <td>작성 규칙</td>
      <td>예</td>
    </tr>
    <tr>
      <td>첫 번째 글자는 1)문자 2)'$' 3)'_'이어야 하고 숫자로 시작 불가</td>
      <td>가능 : price, $price, _price
          불가능 : 1price, @price, $#price</td>
    </tr>
    <tr>
      <td>영어 대소문자 구분</td>
      <td>priceno/priceNo 다른 변수임</td>
    </tr>
    <tr>
      <td>첫 문자는 영어 소문자, 다른 단어가 붙으면 첫문자 대문자</td>
      <td>priceno -> priceNo</td>
    </tr>
    <tr>
      <td>문자수(길이) 제한 없음</td>
      <td></td>
    </tr>
    <tr>
      <td>자바 예약어 사용 불가</td>
      <td></td>
    </tr>
  </table>
  <h4>*예약어란, 이미 해당 프로그래밍 언어에서 의미를 갖고 사용되고 있는 단어</h4>
  <table>
    <tr><td>분류</td><td>예약어</td></tr>
    <tr><td>기본 타입</td><td>boolean, byte, char, chort, int, long, float, double</td></tr>
    <tr><td>접근 제한자</td><td>private, protected, public</td></tr>
    <tr><td>about 클래스</td><td>class, abstract, interface, extends, implements, enum</td></tr>
    <tr><td>about 객체</td><td>new, instanceof, this, super, null</td></tr>
    <tr><td>about 메소드</td><td>void, return</td></tr>
    <tr><td>about 제어문</td><td>if, else, switch, case, default, for, do, while, break, continue</td></tr>
    <tr><td>논리값</td><td>true, false</td></tr>
    <tr><td>예외 처리와 관련된 것</td><td>try, catch, finally, throw, throws</td></tr>
    <tr><td>기타</td><td>package, import, synchronized, final, static</td></tr>
  </table>
  <h4> - 변수가 어떤 범위에서 사용될지 생각하고 / 지역변수, 전역변수 잘 설정해주어야 한다. </h4>
  <h4>* "이스케이프 문자", 문자열 내에서의 특정 문자 사용</h4>
  <table>
    <tr>
      <td>이스케이프 문자</td><td>출력 용도</td>
    </tr>
    <tr>
      <td>\t</td><td>탭만큼 띄움</td>
    </tr>
    <tr>
      <td>\n</td><td>줄 바꿈</td>
    </tr>
    <tr>
      <td>\r</td><td>캐리지리터</td>
    </tr>
    <tr>
      <td>\r"</td><td>" 출력</td>
    </tr>
    <tr>
      <td>\'</td><td>' 출력</td>
    </tr>
    <tr>
      <td>\\</td><td>/ 출력</td>
    </tr>
    <tr>
      <td>\u16진수</td><td>16진수 유니코드에 해당하는 문자 </td>
    </tr>
  </table>
  <h2>2. 타입변환</h2>
  <h4>- 자동 타입변환 : 갑의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생</h4>
  <h4>- 캐스팅(강제 타입변환) : 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제 변환</h4>
  <h4>  ex) double value = 3.14;  int a = (int)value;</h4>
  
  <h2>3. 변수와 시스템 입출력</h2>
  <h3>1)System.out</h3>
  <h5> - System.out.println(내용) : 괄호 안의 내용을 출력하고 행바꾸기</h5>
  <h5> - System.out.print(내용) : 괄호 안의 내용 출력</h5>
  <h5> - System.out.printf("형식문자열", 값1, 값2...) : 괄호 안의 형식문자열대로 값을 차례대로 출력 %s, %d</h5>
  
  <h3>2)System.in</h3>
  <h5> - System.in.read() : 입력된 문자나 숫자의 keyCode값을 받음. (단, 문자열은 불가능)</h5>
  <h5> - Scanner scanner = new scanner(System.in) 문자열을 입력값으로 받아 저장가능</h5>
  <h5> - String inputData = scanner.nextLine(); 문자열을 입력값으로 받아 inputData에 저장</h5>
  <h5> - 기본 타입에 대한 연산비교는 "=="을 통해 하지만 문자열 비교는 ".equals("비교문자열")로 시행</h5>
  
  <h1>Ⅲ. 연산자</h1>
   - 연산에 사용되는 표시나 기호를 연산자(Operator), 연산자와 함께 연산되는 데이터를 피연산자(Operated)라고 한다.
  <h2>연산자의 종류<h2>
  <h3>1.단항연산자 - 피연산자가 단 하나뿐인 연산자를 말하며, 1)부호연산자 2)증감연산자 3)논리부정연산자 가 있다</h3>
    <h4>1)부호연산자(+,-) - 양수 및 음수를 표시하는 +,- </h4>
    <h4>2)증감연산자 = 변수의 값을 1증가(++)시키거나 1감소(--)시키는 연산자</h4>
    <h4>3)논리부정연산자(!) - boolean 타입에서 true-> false / false-> true로 변환</h4>
    <br>
  <h3>2.이항연산자 - 피연산자가 2개인 연산자로 1)산술연산자 2)문자결합연산자 3)비교연산자 4)논리연산자 5)대입연산자 등이 있다.</h3>
    <h4>1)산술연산자(+,-,*,/,%)<h4>
    <h4>2)문자열결합연산자(+) - 문자열을 서로 결합</h4>
    <h4>3)비교연산자(<,<=,>,>=,==,!=) - 피연산자들의 대소를 비교해 true, false 반환</h4>
    <h4>4)논리연산자(&&,||,&,|,^,!)</h4>
      <table>
        <tr><td>구분</td><td colspan="3">연산식</td><td>결과</td><td>설명</td></tr>
        <tr><td rowspan="4">AND(논리곱)</td><td>true</td><td rowspan="4">&& 또는 &</td><td>true</td><td>true</td><td rowspan="4">피연산자 모두가 true일 경우에만 연산결과가 true</td></tr>
        <tr><td>true</td><td>false</td><td>false</td></tr>
        <tr><td>false</td><td>false</td><td>true</td></tr>
        <tr><td>false</td><td>false</td><td>false</td></tr>
        <tr><td rowspan="4">OR(논리합)</td><td>true</td><td rowspan="4">|| 또는 |</td><td>true</td><td>true</td><td rowspan="4">피연산중 하나만 true이면 연산결과는 true</td></tr>
        <tr><td>true</td><td>false</td><td>true</td></tr>
        <tr><td>false</td><td>false</td><td>true</td></tr>
        <tr><td>false</td><td>false</td><td>false</td></tr>
      <tr><td rowspan="4">XOR(배타적 논리합)</td><td>true</td><td rowspan="4">|| 또는 |</td><td>true</td><td>false</td><td rowspan="4">피연산자가 하나는 true이고 다른 하나가 false일 경우에만 연산 결과가 true</td></tr>
        <tr><td>true</td><td>false</td><td>true</td></tr>
        <tr><td>false</td><td>false</td><td>true</td></tr>
        <tr><td>false</td><td>false</td><td>false</td></tr>
      <tr><td rowspan="2">NOT(논리 부정)</td><td rowspan="2"></td><td rowspan="2">!</td><td>true</td><td>false</td><td rowspan="2">피연산자의 논리값을 바꿈</td></tr>
        <tr><td>false</td><td>true</td></tr>  
      </table>
    <h4>5)대입연산자(&&,||,&,|,^,!) - 오른쪽 피연산자의 값을 왼쪽 피연산자인 변수에 저장</h4>
    <br>
  <h3>3.삼항연산자 - 3개의 피연산자를 필요로 하는 연산자</h3>
    <h4>- 조건식(피연산자1) ? 값 또는 연산식(피연산자2) : 값 또는 연산식(피연산자3)</h4>
    <h4>- 위 식에서 피연산자1이 True이면 피연산자2 선택, False이면 피연산자3 선택</h4>
      
  

 

  
