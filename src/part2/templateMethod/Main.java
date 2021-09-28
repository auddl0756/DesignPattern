package part2.templateMethod;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        AbstractCalcArray squareCalcArray  = new SquareCalcArray();
        AbstractCalcArray negativeCalcArray = new NegativeCalcArray();
        int[] sampleArray = new int[]{1,2,3,4,5};

        System.out.println(squareCalcArray.calc(sampleArray));
        System.out.println(negativeCalcArray.calc(sampleArray));
        /*
        * 템플릿 메서드 패턴은 왜 쓰는가?
        * 만약 Abstract 클래스를 구현한 구체 클래스가 많이 있고 calc(int[] array)가 각각 들어 있다고 가정해보자.
        * 이 때 calc(int[] array)에 문제가 발생하면 모든 구체 클래스를 수정해야 한다.
        * template method 패턴으로 Abstract 클래스에 템플릿으로 calc(int[] array)를 작성해 놓으면
        * 템플릿 메서드만 수정하면 된다.
        *
        * 또 템플릿 메서드에 알고리즘,처리 로직이 기술되어 있어서 하위 클래스를 구현할 때는 다른 것에 집중할 수 있다
        * */

        /*
        InputStream inputStream;
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;

        InputStream에 사용된 템플릿 메서드 패턴.
        이렇게 read(byte b[],int off,int len) 안에 템플릿 모양을 정해놓고
        int c= read()여기서 abstract 메서드인 read()의 구체적인 내용은 하위 클래스에서  구현한다.

          public int read(byte b[], int off, int len) throws IOException {
            if (b == null) {
                throw new NullPointerException();
            } else if (off < 0 || len < 0 || len > b.length - off) {
                throw new IndexOutOfBoundsException();
            } else if (len == 0) {
                return 0;
            }

            int c = read();
            if (c == -1) {
                return -1;
            }
            b[off] = (byte)c;

            int i = 1;
            try {
                for (; i < len ; i++) {
                    c = read();
                    if (c == -1) {
                        break;
                    }
                    b[off + i] = (byte)c;
                }
            } catch (IOException ee) {
            }
            return i;
        }
         */
    }
}
