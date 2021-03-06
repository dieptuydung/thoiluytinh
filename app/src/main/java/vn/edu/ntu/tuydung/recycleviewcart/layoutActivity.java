package vn.edu.ntu.tuydung.recycleviewcart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import vn.edu.ntu.tuydung.controller.ICartController;
import vn.edu.ntu.tuydung.model.Product;

public class layoutActivity extends AppCompatActivity {
    TextView txtmh;
    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        addView();
        addEvent();
    }

    public void addView()
    {
        txtmh=findViewById(R.id.txtmh);

        btn1=findViewById(R.id.btnt);
        btn2=findViewById(R.id.btnx);
        callViewCart();
    }
    //xóa sản phẩm
    public void addEvent()
    {
        final ICartController controller =(ICartController) getApplication();
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.clearShopping();
                txtmh.setText("xóa sản phẩm");

            }
        });
    }


//Hiển thị sản sẩm

    private void callViewCart()
    {
        ICartController controller=(ICartController) getApplication();
        ArrayList<Product> products=controller.getds();
        StringBuilder builder=new StringBuilder();
        for(Product product:products)
        {
            builder.append(product.getName()+" "+product.getPrice()+"\n");
        }
        if(builder.toString().length()>0)
        {
            txtmh.setText(builder.toString());
        }
        else
        {
            txtmh.setText("không có sản phẩm nào");
        }
    }
}
