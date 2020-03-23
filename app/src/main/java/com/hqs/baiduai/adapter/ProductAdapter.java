package com.hqs.baiduai.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import com.hqs.baiduai.R;
import com.hqs.baiduai.beans.Card;
import com.lcodecore.tkrefreshlayout.header.progresslayout.CircleImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lcodecore on 2016/12/6.
 */

public class ProductAdapter extends BaseAdapter {

    private List<Card> cards = new ArrayList<>();

    @Override
    public int getCount() {
        return cards.size();
    }

    @Override
    public Card getItem(int position) {
        return cards.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(parent.getContext(), R.layout.item_product, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.tv_title.setText(cards.get(position).title);
        holder.tv_subTitle.setText(cards.get(position).info);

        return convertView;
    }

    class ViewHolder {
        final TextView tv_title;
        final TextView tv_subTitle;

        ViewHolder(View view) {
//            mImageView = (CircleImageView) view.findViewById(R.id.avatar);
            tv_title = (TextView) view.findViewById(R.id.tv_product);
            tv_subTitle = (TextView) view.findViewById(R.id.tv_disc);
        }
    }

    public void refreshCard(){
        cards.clear();
        cards.add(new Card("What Do You Mean?", "Justin Bieber", 0));
        cards.add(new Card("Secret Garden", "Song From A Secret Garden", 0));
        cards.add(new Card("Moves Like Jagger","Maroon 5",0));
        cards.add(new Card("Work Hard, Play Hard","Wiz Khalifa",0));
        cards.add(new Card("See You Again","Charlie Puth",0));
        cards.add(new Card("Love The Way You Lie (Part Ii)","Rihanna",0));
        cards.add(new Card("Call Me Maybe","Carly Rae Jepsen",0));
        cards.add(new Card("Let It Go","Demi Lovato",0));
        notifyDataSetChanged();
    }

    public void loadMoreCard(){
        cards.add(new Card("You Raise Me Up","Westlife",0));
        cards.add(new Card("See You Again","Charlie Puth",0));
        cards.add(new Card("Love Story","Taylor Swift",0));
        cards.add(new Card("Let It Go","Demi Lovato",0));
        cards.add(new Card("Secret Garden", "Song From A Secret Garden", 0));
        cards.add(new Card("Call Me Maybe","Carly Rae Jepsen",0));
        notifyDataSetChanged();
    }

}