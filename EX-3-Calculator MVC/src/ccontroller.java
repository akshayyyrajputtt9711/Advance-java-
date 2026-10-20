import java.awt.event.*;
public class ccontroller implements ActionListener  {
      cview view;
      cmodel model;
      public ccontroller(cview view,cmodel model){
          this.view=view;
          this.model=model;

          view.addi.addActionListener(this);
          view.sub.addActionListener(this);
          view.multi.addActionListener(this);
          view.div.addActionListener(this);
      }

      @Override
      public void actionPerformed(ActionEvent e) {
        double a=Double.parseDouble(view.txta.getText());
        double b=Double.parseDouble(view.txtb.getText());
        double result =0;

        if (e.getSource()==view.addi)
            result=model.addi(a,b);
        else if (e.getSource() == view.sub)
            result = model.sub(a, b);
        else if (e.getSource() == view.multi)
            result = model.multi(a, b);
        else if (e.getSource() == view.div)
            result = model.div(a, b);

          view.txtresult.setText(String.valueOf(result));
      }
}


