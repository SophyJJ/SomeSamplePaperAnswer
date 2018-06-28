public class Review extends Activity{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
        Intent intent = getIntent();
        String review = intent.getStringExtra("review");
        
        TextView textView = (TextView) findViewById(R.id.textView1);
        textView.setText(review);
}