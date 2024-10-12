package src.Design_Patterns;

public class Abstract_Factory_Pattern 
{
    public interface Laptop 
    {
        void showSpecs();
    }
    
    public interface Desktop 
    {
        void showSpecs();
    }

    // Apple 品牌的产品
    public class AppleLaptop implements Laptop {
        @Override
        public void showSpecs() {
            System.out.println("Apple Laptop Specifications");
        }
    }

    public class AppleDesktop implements Desktop {
        @Override
        public void showSpecs() {
            System.out.println("Apple Desktop Specifications");
        }
    }

    // Lenovo 品牌的产品
    public class LenovoLaptop implements Laptop {
        @Override
        public void showSpecs() {
            System.out.println("Lenovo Laptop Specifications");
        }
    }

    public class LenovoDesktop implements Desktop {
        @Override
        public void showSpecs() {
            System.out.println("Lenovo Desktop Specifications");
        }
    }

    public interface ComputerFactory {
        Laptop createLaptop();
        Desktop createDesktop();
    }

    public class AppleFactory implements ComputerFactory {
        @Override
        public Laptop createLaptop() {
            return new AppleLaptop();
        }
    
        @Override
        public Desktop createDesktop() {
            return new AppleDesktop();
        }
    }
    
    public class LenovoFactory implements ComputerFactory {
        @Override
        public Laptop createLaptop() {
            return new LenovoLaptop();
        }
    
        @Override
        public Desktop createDesktop() {
            return new LenovoDesktop();
        }
    }

    public  void test()
    {
        // 创建工厂
        ComputerFactory appleFactory = new AppleFactory();
        ComputerFactory lenovoFactory = new LenovoFactory();

        // 创建 Apple 产品的笔记本和台式机
        Laptop appleLaptop = appleFactory.createLaptop();
        Desktop appleDesktop = appleFactory.createDesktop();
        appleLaptop.showSpecs();
        appleDesktop.showSpecs();

        // 创建 Lenovo 产品的笔记本和台式机
        Laptop lenovoLaptop = lenovoFactory.createLaptop();
        Desktop lenovoDesktop = lenovoFactory.createDesktop();
        lenovoLaptop.showSpecs();
        lenovoDesktop.showSpecs();
    }

    public static void main(String[] args) {
        Abstract_Factory_Pattern afp = new Abstract_Factory_Pattern();
        afp.test();
    }

}
