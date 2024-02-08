package com.ohgiraffers.section02.string;

public class Application1 {
    public static void main(String[] args) {
        /* charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자 반환
        *  인덱스를 벗어난 정수를 인자로 전달하는 경우 IndexOutOfBoundsException 발생 */

        String str1 = "apple";

        for(int i=0; i<str1.length(); i++){
            System.out.println("charAt("+i+") : " + str1.charAt(i));
        }

        /* compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
        *  두 문자열이 같다면 0을 반환, 인자로 전달된 무자열보다 작으면 음수, 크면 양수 반환
        *  단, 이 메소드는 대소문자를 구분하여 비교한다. */

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : " + (str2.compareTo(str3)));  // 0 같으면 0을 반환
        System.out.println("compareTo() : " + (str2.compareTo(str4)));  // 32 만큼의 차이가 난다고 생각하면 됨(소문자에 대문자 비교시 양수)
        System.out.println("compareTo() : " + (str4.compareTo(str2)));  // -32 대문자에 소문자 비교시 음수

        System.out.println("compareTo() : " + (str2.compareTo(str5)));  // -5
        System.out.println("compareTo() : " + (str5.compareTo(str2)));  // 5

        /* compareToIgnoreCase() : 대소문자를 구분하지 않고 비교 */
        System.out.println("compareToIgnoreCase() : " + (str3.compareToIgnoreCase(str4)));  // 0

        /* concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열 반환 (원본에는 영향 안줌) */
        System.out.println("concat() : " + (str2.concat(str5)));    // javaoracle
        System.out.println("str2 : " + str2);                       // java (원본은 그대로)

        /* indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
        *              단, 일치하는 문자가 없는 경우 -1 반환 */
        String text = "java oracle";
        System.out.println("indexOf('a') : " + text.indexOf('a'));   // 1
        System.out.println("indexOf('b') : " + text.indexOf('b'));   // -1

        /* trim() : 문자열의 앞 뒤에 공백을 제거한 문자열 반환 */
        String trimString = "   java   ";
        System.out.println("trimString : #" + trimString + "#");                    // #   java   #
        System.out.println("trim('trimString') : #" + trimString.trim() + "#");     // #java#

        /* toLowerCase() : 모든 문자를 소문자로 변환
        *  toUpperCase() : 모든 문자를 대문자로 변환 */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() : " + caseStr.toLowerCase()); // javaoracle
        System.out.println("toUpperCase() : " + caseStr.toUpperCase()); // JAVAORACLE

        /* subString() : 문자열의 일부분을 잘라내어 새로운 문자열 반환 */
        String javamysql = "javamysql";
        System.out.println("substirng(3,6) : " + javamysql.substring(3,6));         // amy (3번 인덱스부터 6번 인덱스 바로 앞까지 잘라온다.)
        System.out.println("substirng(3) : " + javamysql.substring(3));   // amysql (3번 인덱스부터 끝까지) : 숫자를 하나만 적어주면 시작값만 설정해 주는것임

        /* replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환 */
        System.out.println("replace() : " + javamysql.replace("java", "python"));   // pythonmysql (java 부분이 python으로 바꼈다.)

        /* length() : 문자열의 길이를 정수형으로 반환 */
        System.out.println("length() : " + javamysql.length()); // 9
        System.out.println("빈 문자열의 길이 : " + ("".length())); // 0

        /* isEmpty() : 문자열의 길이가 0이면 true 반환, 아니면 false 반환 (길이가 0인 문자열은 null과 다르다) */
        System.out.println("isEmpty() : " + "".isEmpty());      // true
        System.out.println("isEmpty() : " + "abc".isEmpty());   // false

        String s = "";    // 문자열은 공백 가능
//        char c = '';    // 문자형은 빈 공간이 들어갈수 없다.
    }
}
