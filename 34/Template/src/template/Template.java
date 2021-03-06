
package template;

class TemplateS<E>{
    private E h;
    public TemplateS(E x){
        h = x;
    }
    E getH(){
        return h;
    }
}

public class Template {

    public static void main(String[] args) {
        TemplateS<Integer> a = new TemplateS<Integer>(12);
        System.out.println(a.getH());
        
        TemplateS<Float> b;
        b = new TemplateS<Float>((float)12.56);
        System.out.println(b.getH());
        
        TemplateS<Double> c = new TemplateS<Double>(16.5987663);
        System.out.println(c.getH());
        
        TemplateS<String> d = new TemplateS<String>("Dezső");
        System.out.println(d.getH());
    }
    
}
