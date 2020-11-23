public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            int a,b;
            System.out.println("请输入数字：");
            a=sc.nextInt();
            a=(int)(1+Math.random()*100);
            b=(int)(1+Math.random()*100);
            System.out.println("随机坐标："+"("+a+","+b+")");
        }

    }
