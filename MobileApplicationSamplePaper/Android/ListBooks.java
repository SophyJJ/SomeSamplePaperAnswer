public class ListBooks extends ListActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        String search = intent.getStringExtra("search");

        new AsyncTask<string, Void, List<Book>(){
            @Override
            protected List<Book> doinBackground(String... param){
                String searchUrl = "http://192.168.56.101/books/Search/" + param[0];
                List<Book> bookList = Book.readBook(searchUrl);
                return bookList;            
            }

            @Override
            protected void onPostExecute(List<Book> resultBookList){
                ListAdapter adapter = new SimpleCursorAdapter(
                    this, 
                    resultBookList,
                    android.R.layout.two_line_list_item, 
                    new String[] { "title", "author" },
                    new int[] { android.R.id.text1, android.R.id.text2 });
                setListAdapter(adapter);
            }
        }.execute(search);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id){
        Book book = (Book) getListAdapter().getItem(position);
        Intent intent = new Intent(getApplicationContext(), Review.class);
        intent.putExtra("review", book.review);
        startActivity(intent);
    }
}
