fun main(args: Array<String>) {//fun이 함수이름이고, 메인함수
    /*
    step1. 인사말 출력
    step2. 사용자 이름 받기
    step3. 입력 받은 사용자 이름 출력
     */

     println("안녕하세요, Shoppi 에 오신 것을 환영합니다!")
     println("쇼핑을 계속 하시려면 이름을 입력해주세요 : ")
     val name = readLine()
     println("""
          감사합니다, 반갑습니다 $name 님 !
          원하시는 카테고리를 입력해주세요
     """.trimIndent()) //trimindent = 문장의 들여쓰기를 없애줌


}