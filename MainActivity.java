package mydomain.HelloWorld;

import android.app.Activity;
import android.os.Bundle;

import android.app.*;
import android.os.*;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.KeyEvent.Callback;
import	android.view.KeyEvent;
import android.view.MenuInflater;
import 	android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewConfiguration;

import android.content.ContextWrapper;
import android.view.ContextThemeWrapper;

import android.content.Context;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;


public class MainActivity extends Activity
{
	
   String[] menuarray={"menu1", "menu2","menu3","menu4","menu5"};
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
      
      ArrayAdapter adapter = new ArrayAdapter<String>(this,  R.layout.listview, menuarray);
      
      ListView listview = (ListView) findViewById(R.id.menus_list);
      listview.setAdapter(adapter);
listview.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
					setTitle(parent.getItemAtPosition(position).toString());
					}});
    }

	
}
