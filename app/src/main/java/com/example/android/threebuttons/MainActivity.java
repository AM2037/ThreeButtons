package com.example.android.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getSimpleName();

    public static final String EXTRA_PASSAGE = "com.example.android.threebuttons.extra.PASSAGE";

    // Unique tag for intent extras
    public static final int TEXT_REQUEST1 = 1;
    public static final int TEXT_REQUEST2 = 2;
    public static final int TEXT_REQUEST3 = 3;


    private Button mBtnOne;
    private Button mBtnTwo;
    private Button mBtnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize buttons
        mBtnOne = findViewById(R.id.button_one);
        mBtnTwo = findViewById(R.id.button_two);
        mBtnThree = findViewById(R.id.button_three);

    }




    public void launchSecondActivity(View view) {
        // On click listener for text one
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String passage1 = "Sense child do state to defer mr of forty. Become latter but nor abroad wisdom waited. Was delivered gentleman acuteness but daughters. In as of whole as match asked. Pleasure exertion put add entrance distance drawings. In equally matters showing greatly it as. Want name any wise are able park when. Saw vicinity judgment remember finished men throwing. \n" +
                        "\n" +
                        "Living valley had silent eat merits esteem bed. In last an or went wise as left. Visited civilly am demesne so colonel he calling. So unreserved do interested increasing sentiments. Vanity day giving points within six not law. Few impression difficulty his use has comparison decisively. \n" +
                        "\n" +
                        "Left till here away at to whom past. Feelings laughing at no wondered repeated provided finished. It acceptance thoroughly my advantages everything as. Are projecting inquietude affronting preference saw who. Marry of am do avoid ample as. Old disposal followed she ignorant desirous two has. Called played entire roused though for one too. He into walk roof made tall cold he. Feelings way likewise addition wandered contempt bed indulged. ";
                intent.putExtra(EXTRA_PASSAGE, passage1);
                startActivityForResult(intent, TEXT_REQUEST1);
                Log.d(LOG_TAG, "Button one clicked!");
            }

        });

        // On click listener for text two
        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String passage2 = "To sorry world an at do spoil along. Incommode he depending do frankness remainder to. Edward day almost active him friend thirty piqued. People as period twenty my extent as. Set was better abroad ham plenty secure had horses. Admiration has sir decisively excellence say everything inhabiting acceptance. Sooner settle add put you sudden him. \n" +
                        "\n" +
                        "Now principles discovered off increasing how reasonably middletons men. Add seems out man met plate court sense. His joy she worth truth given. All year feet led view went sake. You agreeable breakfast his set perceived immediate. Stimulated man are projecting favourable middletons can cultivated. \n" +
                        "\n" +
                        "Now eldest new tastes plenty mother called misery get. Longer excuse for county nor except met its things. Narrow enough sex moment desire are. Hold who what come that seen read age its. Contained or estimable earnestly so perceived. Imprudence he in sufficient cultivated. Delighted promotion improving acuteness an newspaper offending he. Misery in am secure theirs giving an. Design on longer thrown oppose am. ";
                intent.putExtra(EXTRA_PASSAGE, passage2);
                startActivityForResult(intent, TEXT_REQUEST2);
                Log.d(LOG_TAG, "Button two clicked!");
            }

        });

        // On click listener for text three
        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                String passage3 = "Or neglected agreeable of discovery concluded oh it sportsman. Week to time in john. Son elegance use weddings separate. Ask too matter formed county wicket oppose talent. He immediate sometimes or to dependent in. Everything few frequently discretion surrounded did simplicity decisively. Less he year do with no sure loud. \n" +
                        "\n" +
                        "Far concluded not his something extremity. Want four we face an he gate. On he of played he ladies answer little though nature. Blessing oh do pleasure as so formerly. Took four spot soon led size you. Outlived it received he material. Him yourself joy moderate off repeated laughter outweigh screened. \n" +
                        "\n" +
                        "Now led tedious shy lasting females off. Dashwood marianne in of entrance be on wondered possible building. Wondered sociable he carriage in speedily margaret. Up devonshire of he thoroughly insensible alteration. An mr settling occasion insisted distance ladyship so. Not attention say frankness intention out dashwoods now curiosity. Stronger ecstatic as no judgment daughter speedily thoughts. Worse downs nor might she court did nay forth these. ";
                intent.putExtra(EXTRA_PASSAGE, passage3);
                startActivityForResult(intent, TEXT_REQUEST3);
                Log.d(LOG_TAG, "Button three clicked!");
            }

        });
    }
}
