package com.touchvie.touchvie_front.logic;

import android.content.Context;
import android.content.res.Resources;

import com.google.gson.GsonBuilder;
import com.touchvie.backend.CardData;
import com.touchvie.backend.MiniCard;
import com.touchvie.backend.carddetail.relations.DupleRel;
import com.touchvie.backend.carddetail.relations.RelationTypes;
import com.touchvie.backend.carddetail.relations.SingleRel;
import com.touchvie.touchvie_client.data.CarouselCard;
import com.touchvie.touchvie_front.R;
import com.touchvie.touchvie_front.data.CarouselCell;
import com.touchvie.touchvie_front.data.GroupableTree;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

import static com.touchvie.backend.carddetail.relations.ContentTypes.CASTING;
import static com.touchvie.backend.carddetail.relations.ContentTypes.FEATURES_IN;
import static com.touchvie.backend.carddetail.relations.ContentTypes.FILMOGRAPHY;
import static com.touchvie.backend.carddetail.relations.ContentTypes.MOVIE_LOCATIONS;
import static com.touchvie.backend.carddetail.relations.ContentTypes.WORN_BY;

/**
 * Created by Tagsonomy S.L. on 27/09/2016.
 */

public class CarouselLogic {
    private Context context;
    private GroupableTree groupableTree;
    private HashMap<String, HashMap<String, String>> tree;
    private HashMap<String, String> tree1;

    public CarouselLogic(Context context) {
        this.context = context;
        loadGroupable();
    }

    public ArrayList<CarouselCell> processData(ArrayList<CarouselCard> cards) {
        CarouselCard lastCard = null;
        CarouselCard newCard = null;
        ArrayList<CarouselCell> cells = new ArrayList<>();
        ArrayList<MiniCard> cellCards = null;
        CarouselCell newCell = null;
        boolean setNewCell = true;
        int rel = 0;

        for (CarouselCard card : cards) {
            if (setNewCell) {
                newCell = new CarouselCell();
                cellCards = new ArrayList<>();
            }

            newCard = card;
            if (lastCard == null) {
                MiniCard temp;
                temp = card.getData().getMiniCard();
                cellCards.add(temp);
                lastCard = newCard;
                setNewCell = false;
                continue;
            }
            if (checkGroupableTree(newCard, lastCard)) {
                MiniCard temp;
                temp = newCard.getData().getMiniCard();
                cellCards.add(temp);
                if (newCard.getChildren() != null) {
                    for (int i = 0; i < newCard.getChildren().length - 1; i++) {

//                        for (int j = 0; i < newCard.getChildren()[i].getData().length - 1; j++) {
                        MiniCard temp2;
//                            temp2 = newCard.gethildren()[i].getData()[j];
                        if (RelationTypes.SINGLE.equals(newCard.getChildren()[i].getType())) {
                            temp2 = ((SingleRel) newCard.getChildren()[i]).getData();
                        }
                        else {
                            switch (newCard.getChildren()[i].getContent_type()) {
                                case CASTING:
                                    temp2 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case MOVIE_LOCATIONS:
                                    temp2 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case FILMOGRAPHY:
                                    temp2 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case WORN_BY:
                                    temp2 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case FEATURES_IN:
                                    temp2 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                default:
                                    continue;
                            }
                        }
                        cellCards.add(temp2);
                        rel++;
                        if (rel == 2)
                            break;
//                        }
                    }
                    ArrayList<MiniCard> tempNewCell;
                    tempNewCell = cellCards;
                    newCell.setCards(tempNewCell);
                    newCell.setSceneNr(card.getSceneNumber());
                    cellCards = null;
                    cells.add(newCell);
//                    cellCards.clear();
                    setNewCell = true;
                    continue;
                } else {
                    if (cellCards.size() < 2)
                        setNewCell = false;
                    else
                        setNewCell = true;
                }
            } else {
                ArrayList<MiniCard> temp;
                temp = cellCards;
                newCell.setCards(temp);
                newCell.setSceneNr(lastCard.getSceneNumber());
                cells.add(newCell);
                newCell = new CarouselCell();
                cellCards = new ArrayList<>();
                MiniCard temp2;
                temp2 = newCard.getData().getMiniCard();
                cellCards.add(temp2);
                if (newCard.getChildren() != null) {
                    outerloop:
                    for (int i = 0; i < newCard.getChildren().length - 1; i++) {

//                        for (int j = 0; i < newCard.getChildren()[i].getData().length - 1; j++) {
                        MiniCard temp3;
//                            temp2 = newCard.gethildren()[i].getData()[j];
                        if (RelationTypes.SINGLE.equals(newCard.getChildren()[i].getType())) {
                            temp3 = ((SingleRel) newCard.getChildren()[i]).getData();
                        }
                        else {
                            switch (newCard.getChildren()[i].getContent_type()) {
                                case CASTING:
                                    temp3 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case MOVIE_LOCATIONS:
                                    temp3 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case FILMOGRAPHY:
                                    temp3 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case WORN_BY:
                                    temp3 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                case FEATURES_IN:
                                    temp3 = ((DupleRel) newCard.getChildren()[i]).getTo();
                                    break;
                                default:
                                    continue;
                            }
                        }
                        cellCards.add(temp3);
                        rel++;
                        if (rel == 2)
                            break;
//                        }
                    }
                    ArrayList<MiniCard> tempNewCell;
                    tempNewCell = cellCards;
                    newCell.setCards(tempNewCell);
                    newCell.setSceneNr(card.getSceneNumber());
                    cellCards = null;
                    cells.add(newCell);
                    setNewCell = true;
                    continue;
                } else {
                    if (cellCards.size() < 2)
                        setNewCell = false;
                    else
                        setNewCell = true;
                }
            }
            lastCard = newCard;
        }
        return cells;
    }

    private boolean checkGroupableTree(CarouselCard card, CarouselCard last) {
        if (last.getData().getMiniCard()!=null) {
            if (tree.get(last.getData().getMiniCard().getType()) != null && tree.get(last.getData().getMiniCard().getType()).get(card.getData().getMiniCard().getType()) != null) {
                return true;
            }
        }
        return false;
    }

    ;

    private void loadGroupable() {
        String jsonString = null;
        try {
            Resources res = context.getResources();
            InputStream in_s = res.openRawResource(R.raw.groupabletree);

            byte[] b = new byte[in_s.available()];
            in_s.read(b);
            jsonString = new String(b);
        } catch (Exception e) {
            return;
            //jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
        }
        groupableTree = new GsonBuilder().create().fromJson(jsonString, GroupableTree.class);
        if (groupableTree == null) {
            groupableTree = new GroupableTree();
        }

        tree = new HashMap<>();
        tree1 = new HashMap<>();
        System.out.println("KKKKKKKKKKKKKKKKKKKKK   gourpableTree.size: : " + groupableTree.getTrees().length);
        System.out.println("KKKKKKKKKKKKKKKKKKKKK   tree: " + jsonString);
        for (int i = 0; i < groupableTree.getTrees().length; i++) {
            if (groupableTree.getTrees()[i].getChildren() != null && groupableTree.getTrees()[i].getChildren().length > 0) {
                System.out.println("KKKKKKKKKKKKKKKKKKKKKK   groupableTree.getTrees()[i].getChildren(): " + groupableTree.getTrees()[i].getChildren().toString());
                if (groupableTree.getTrees()[i].getChildren()[0].getChildren() != null && groupableTree.getTrees()[i].getChildren()[0].getChildren().length > 0) {
                    System.out.println("KKKKKKKKKKKKKKKKKK   i: "+ i + "  length: " +groupableTree.getTrees()[i].getChildren()[0].getChildren().length);
                    System.out.println("KKKKKKKKKKKKKKKKKK   i: "+ i + "  " +groupableTree.getTrees()[i].getTypeOfCard());
                    System.out.println("KKKKKKKKKKKKKKKKKK   i: "+ i + "  " +groupableTree.getTrees()[i].getChildren()[0].getTypeOfCard().toString());
                    System.out.println("KKKKKKKKKKKKKKKKKK    "+ groupableTree.getTrees()[i].getChildren()[0].getChildren()[0].getTypeOfCard().toString());
                    tree1.put(groupableTree.getTrees()[i].getChildren()[0].getTypeOfCard().toString(), groupableTree.getTrees()[i].getChildren()[0].getChildren()[0].getTypeOfCard().toString());
                } else {
                    System.out.println("KKKKKKKKKKKKKKKKKK    i: " + i + "   " + groupableTree.getTrees()[i].getChildren()[0].getTypeOfCard().toString() + "  :  null");
                    tree1.put(groupableTree.getTrees()[i].getChildren()[0].getTypeOfCard().toString(), null);
                }
                tree.put(groupableTree.getTrees()[i].getTypeOfCard().toString(), tree1);
            }
        }


    }
}
