public static void main(String[] args) {
        final Random random=new Random();
        Timer execut=new Timer();
        execut.schedule(new TimerTask() {
            @Override
            public void run() {
                int a,b;
                System.out.println("请输入数字：");
                a=(int)(1+Math.random()*100);
                b=(int)(1+Math.random()*100);
                System.out.println("随机坐标："+"("+a+","+b+")");
            }
        },0,1000);
    }
