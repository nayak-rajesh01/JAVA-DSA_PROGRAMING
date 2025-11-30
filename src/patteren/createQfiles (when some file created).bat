@echo off
setlocal

REM Creates Q41.java..Q50.java with a main template (1st for Start, 2nd for step, 3rd for end)
for /L %%i in (91,1,100) do (
  >"Q%%i.java" echo /*
  >>"Q%%i.java" echo */
  >>"Q%%i.java" echo package patteren;
  >>"Q%%i.java" echo import java.util.Scanner;
  >>"Q%%i.java" echo public class Q%%i {
  >>"Q%%i.java" echo     public static void main^(String[] args^) 
  >>"Q%%i.java" echo     {
  >>"Q%%i.java" echo         int n;
  >>"Q%%i.java" echo         Scanner sc = new Scanner^(System.in^);
  >>"Q%%i.java" echo         System.out.println^("Enter the Number of Rows"^);
  >>"Q%%i.java" echo         n = sc.nextInt^(^);
  >>"Q%%i.java" echo         printPattern^(n^);
  >>"Q%%i.java" echo         sc.close^(^); 
  >>"Q%%i.java" echo     }
  >>"Q%%i.java" echo     public static void printPattern^(int n^) 
  >>"Q%%i.java" echo     {
  >>"Q%%i.java" echo     }
  >>"Q%%i.java" echo }
)

echo Created Q1.java through Qn.java
pause
