package com.example.carrusel;

import static com.example.carrusel.R.*;
import static com.example.carrusel.R.drawable.*;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.TransitionAdapter;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.google.android.material.card.MaterialCardView;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public class MainActivity extends AppCompatActivity {

    private HashMap _$_findViewCache;
    private String nameCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        //cards model and code
        CreditCardsViewModel model = ViewModelProviders.of((FragmentActivity) this).get(CreditCardsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(model, "ViewModelProviders\n     …rdsViewModel::class.java)");
        final CreditCardsViewModel viewModel = model;
        viewModel.getModelStream().observe((LifecycleOwner) this, (Observer) (new Observer() {
            public void onChanged(Object var1) {
                this.onChanged((CreditCardsModel) var1);
            }
            public void onChanged(CreditCardsModel it) {
                MainActivity activity = MainActivity.this;
                Intrinsics.checkNotNullExpressionValue(it, "it");
                activity.bindCard(it);
                System.out.println(viewModel.getCurrentIndex());
                Toast.makeText(getApplicationContext(), nameCard, Toast.LENGTH_SHORT).show();
            }
        }));
        //update cards ids after swiping cards position
        ((MotionLayout) this._$_findCachedViewById(id.motionLayout)).setTransitionListener((MotionLayout.TransitionListener) (new TransitionAdapter() {
            public void onTransitionCompleted(@NotNull final MotionLayout motionLayout, final int currentId) {
                Intrinsics.checkNotNullParameter(motionLayout, "motionLayout");
                motionLayout.post((Runnable) (new Runnable() {
                    @SuppressLint("NonConstantResourceId")
                    public void run() {
                        switch (currentId) {
                            case id.secondCard:
                                motionLayout.setProgress(0.0F);
                                viewModel.swipeRight();
                                break;
                            case id.firstCard:
                                motionLayout.setProgress(0.0F);
                                viewModel.swipeLeft();
                        }
                    }
                }));
            }
        }));

        //search widget code
        String[] cards = getResources().getStringArray(array.cards);
        AutoCompleteTextView editText = findViewById(id.actv);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, layout.custom_list_item, R.id.text_view_list_item, cards);
        editText.setAdapter(adapter);

        editText.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                switch (adapter.getItem(position)){
                    case "The Fool":
                        nameCard = "(0) The Fool";
                        viewModel.setCurrentIndex(17);
                        break;
                    case "The Magician":
                        nameCard = "(1) The Magician";
                        viewModel.setCurrentIndex(18);
                        break;
                    case "The High Priestess":
                        nameCard = "(2) The High Priestess";
                        viewModel.setCurrentIndex(19);
                        break;
                    case "The Empress":
                        nameCard = "(3) The Empress";
                        viewModel.setCurrentIndex(20);
                        break;
                    case "The Emperor":
                        nameCard = "(4) The Emperor";
                        viewModel.setCurrentIndex(21);
                        break;
                    case "The Hierophant":
                        nameCard = "(5) The Hierophant";
                        viewModel.setCurrentIndex(22);
                        break;
                    case "The Lovers":
                        nameCard = "(6) The Lovers";
                        viewModel.setCurrentIndex(23);
                        break;
                    case "The Chariot":
                        nameCard = "(7) The Chariot";
                        viewModel.setCurrentIndex(24);
                        break;
                    case "Strength":
                        nameCard = "(8) Strength";
                        viewModel.setCurrentIndex(25);
                        break;
                    case "The Hermit":
                        nameCard = "(9) The Hermit";
                        viewModel.setCurrentIndex(26);
                        break;
                    case "Wheel of Fortune":
                        nameCard = "(10) Wheel of Fortune";
                        viewModel.setCurrentIndex(27);
                        break;
                    case "Justice":
                        nameCard = "(11) Justice";
                        viewModel.setCurrentIndex(28);
                        break;
                    case "The Hanged Man":
                        nameCard = "(12) The Hanged Man";
                        viewModel.setCurrentIndex(29);
                        break;
                    case "Death":
                        nameCard = "(13) Death";
                        viewModel.setCurrentIndex(30);
                        break;
                    case "Temperance":
                        nameCard = "(14) Temperance";
                        viewModel.setCurrentIndex(31);
                        break;
                    case "The Devil":
                        nameCard = "(15) The Devil";
                        viewModel.setCurrentIndex(32);
                        break;
                    case "The Tower":
                        nameCard = "(16) The Tower";
                        viewModel.setCurrentIndex(33);
                        break;
                    case "The Star":
                        nameCard = "(17) The Star";
                        viewModel.setCurrentIndex(34);
                        break;
                    case "The Moon":
                        nameCard = "(18) The Moon";
                        viewModel.setCurrentIndex(35);
                        break;
                    case "The Sun":
                        nameCard = "(19) The Sun";
                        viewModel.setCurrentIndex(36);
                        break;
                    case "The World":
                        nameCard = "(21) The World";
                        viewModel.setCurrentIndex(37);
                        break;
                }
                editText.setText("");
            }
        });


    }

    // binds card model with its background
    private void bindCard(CreditCardsModel it) {
        ((MaterialCardView) this._$_findCachedViewById(id.cardLeft1)).setBackground(AppCompatResources.getDrawable(this, it.getCardFourLeft().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardLeft2)).setBackground(AppCompatResources.getDrawable(this, it.getCardThreeLeft().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardLeft3)).setBackground(AppCompatResources.getDrawable(this, it.getCardTwoLeft().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardLeft4)).setBackground(AppCompatResources.getDrawable(this, it.getCardOneLeft().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardCenter)).setBackground(AppCompatResources.getDrawable(this, it.getCardCenter().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardRight1)).setBackground(AppCompatResources.getDrawable(this, it.getCardOneRight().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardRight2)).setBackground(AppCompatResources.getDrawable(this, it.getCardTwoRight().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardRight3)).setBackground(AppCompatResources.getDrawable(this, it.getCardThreeRight().getBackground()));
        ((MaterialCardView) this._$_findCachedViewById(id.cardRight4)).setBackground(AppCompatResources.getDrawable(this, it.getCardFourRight().getBackground()));
        bindNameCard(it.getCardCenter().getBackground());
    }

    //checks id
    @SuppressLint("NonConstantResourceId")
    private void bindNameCard(int CardCenter){
        switch (CardCenter){
            case thefool0:
                nameCard = "(0) The Fool";
                break;
            case themagician1:
                nameCard = "(1) The Magician";
                break;
            case thepriestess2:
                nameCard = "(2) The High Priestess";
                break;
            case theempress3:
                nameCard = "(3) The Empress";
                break;
            case theemperor4:
                nameCard = "(4) The Emperor";
                break;
            case thehierophant5:
                nameCard = "(5) The Hierophant";
                break;
            case thelovers6:
                nameCard = "(6) The Lovers";
                break;
            case thechariot7:
                nameCard = "(7) The Chariot";
                break;
            case strength8:
                nameCard = "(8) Strength";
                break;
            case thehermit9:
                nameCard = "(9) The Hermit";
                break;
            case wheeloffortune10:
                nameCard = "(10) Wheel of Fortune";
                break;
            case justice11:
                nameCard = "(11) Justice";
                break;
            case thehangedman12:
                nameCard = "(12) The Hanged Man";
                break;
            case death13:
                nameCard = "(13) Death";
                break;
            case temperance14:
                nameCard = "(14) Temperance";
                break;
            case thedevil15:
                nameCard = "(15) The Devil";
                break;
            case thetower16:
                nameCard = "(16) The Tower";
                break;
            case thestar17:
                nameCard = "(17) The Star";
                break;
            case themoon18:
                nameCard = "(18) The Moon";
                break;
            case thesun19:
                nameCard = "(19) The Sun";
                break;
            case theworld21:
                nameCard = "(21) The World";
                break;
        }
    }


    //hashmap
    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View var2 = (View) this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }


}