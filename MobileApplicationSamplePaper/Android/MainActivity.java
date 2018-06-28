public class MainActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button btnSearch = (Button) findViewById(R.id.button1);
        btnSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            protected void onClick(View v){
                EditText searchBox = (EditText) v.findViewById(R.id.editText1)
                String search = searchBox.getText().toString();

                Intent intent = new Intent(getApplicationContext(), ListBooks.class);
                intent.putExtra("search", search);
                startActivity(intent);
            }
        })
    }
}