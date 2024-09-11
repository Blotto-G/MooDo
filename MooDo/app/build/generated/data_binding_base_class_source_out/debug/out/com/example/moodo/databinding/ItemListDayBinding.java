// Generated by view binder compiler. Do not edit!
package com.example.moodo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moodo.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemListDayBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout itemDayLayout;

  @NonNull
  public final TextView itemDayTxt;

  @NonNull
  public final ImageView itemMood;

  @NonNull
  public final ImageView todoOval;

  private ItemListDayBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout itemDayLayout,
      @NonNull TextView itemDayTxt, @NonNull ImageView itemMood, @NonNull ImageView todoOval) {
    this.rootView = rootView;
    this.itemDayLayout = itemDayLayout;
    this.itemDayTxt = itemDayTxt;
    this.itemMood = itemMood;
    this.todoOval = todoOval;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListDayBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListDayBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_list_day, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListDayBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout itemDayLayout = (LinearLayout) rootView;

      id = R.id.itemDayTxt;
      TextView itemDayTxt = ViewBindings.findChildViewById(rootView, id);
      if (itemDayTxt == null) {
        break missingId;
      }

      id = R.id.itemMood;
      ImageView itemMood = ViewBindings.findChildViewById(rootView, id);
      if (itemMood == null) {
        break missingId;
      }

      id = R.id.todoOval;
      ImageView todoOval = ViewBindings.findChildViewById(rootView, id);
      if (todoOval == null) {
        break missingId;
      }

      return new ItemListDayBinding((LinearLayout) rootView, itemDayLayout, itemDayTxt, itemMood,
          todoOval);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
