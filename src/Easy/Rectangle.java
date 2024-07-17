package Easy;

public class Rectangle {
    public static int RectangleArea(String []str){
        int minX=Integer.MAX_VALUE;
        int maxX=Integer.MIN_VALUE;
        int minY=Integer.MAX_VALUE;
        int maxY=Integer.MIN_VALUE;


        for(String s:str) {
            s = s.replaceAll("[()]", "");
            String[] co = s.split(" ");
            int x = Integer.parseInt(co[0]);
            int y = Integer.parseInt(co[1]);


            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);

        }

        int w=maxX-minX;
        int d=maxY-minY;

        int res=w*d;
        return  res;

        }

    public static void main(String[] args) {
        String[] A = { "(1 1)", "(1 3)", "(3 1)", "(3 3)" };
        String[] B = { "(0 0)", "(1 0)", "(1 1)", "(0 1)" };
        String[] C = { "(0 0)", "(3 0)", "(0 2)", "(3 2)" };
        String[] D = { "(-1 -1)", "(0 0)", "(-1 0)", "(0 -1)" };
        String[] E = { "(-2 -2)", "(0 0)", "(-2 0)", "(0 -2)" };
        String[] F = { "(0 0)", "(0 0)", "(0 0)", "(0 0)" };

        System.out.println(RectangleArea(A)); // 4
        System.out.println(RectangleArea(B)); // 1
        System.out.println(RectangleArea(C)); // 6
        System.out.println(RectangleArea(D)); // 1
        System.out.println(RectangleArea(E)); // 4
        System.out.println(RectangleArea(F)); // 0
    }
    }

