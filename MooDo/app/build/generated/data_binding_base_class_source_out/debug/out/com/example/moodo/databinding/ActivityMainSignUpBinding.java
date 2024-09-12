// Generated by view binder compiler. Do not edit!
package com.example.moodo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.moodo.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainSignUpBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView btnClose;

  @NonNull
  public final Button btnSignUp;

  @NonNull
  public final TextView checkAge;

  @NonNull
  public final TextView checkId;

  @NonNull
  public final TextView checkPw;

  @NonNull
  public final TextView checkPwSame;

  @NonNull
  public final TextInputEditText edtAge;

  @NonNull
  public final TextInputEditText edtId;

  @NonNull
  public final TextInputEditText edtName;

  @NonNull
  public final TextInputEditText edtPw;

  @NonNull
  public final TextInputEditText edtPwCheck;

  @NonNull
  public final ConstraintLayout main;

  @NonNull
  public final TextInputLayout textInputLayout1;

  @NonNull
  public final TextInputLayout textInputLayout2;

  @NonNull
  public final TextInputLayout textInputLayout3;

  @NonNull
  public final TextInputLayout textInputLayout4;

  @NonNull
  public final TextInputLayout textInputLayout5;

  @NonNull
  public final TextView title02;

  private ActivityMainSignUpBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView btnClose,
      @NonNull Button btnSignUp, @NonNull TextView checkAge, @NonNull TextView checkId,
      @NonNull TextView checkPw, @NonNull TextView checkPwSame, @NonNull TextInputEditText edtAge,
      @NonNull TextInputEditText edtId, @NonNull TextInputEditText edtName,
      @NonNull TextInputEditText edtPw, @NonNull TextInputEditText edtPwCheck,
      @NonNull ConstraintLayout main, @NonNull TextInputLayout textInputLayout1,
      @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3,
      @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5,
      @NonNull TextView title02) {
    this.rootView = rootView;
    this.btnClose = btnClose;
    this.btnSignUp = btnSignUp;
    this.checkAge = checkAge;
    this.checkId = checkId;
    this.checkPw = checkPw;
    this.checkPwSame = checkPwSame;
    this.edtAge = edtAge;
    this.edtId = edtId;
    this.edtName = edtName;
    this.edtPw = edtPw;
    this.edtPwCheck = edtPwCheck;
    this.main = main;
    this.textInputLayout1 = textInputLayout1;
    this.textInputLayout2 = textInputLayout2;
    this.textInputLayout3 = textInputLayout3;
    this.textInputLayout4 = textInputLayout4;
    this.textInputLayout5 = textInputLayout5;
    this.title02 = title02;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainSignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainSignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainSignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnClose;
      ImageView btnClose = ViewBindings.findChildViewById(rootView, id);
      if (btnClose == null) {
        break missingId;
      }

      id = R.id.btnSignUp;
      Button btnSignUp = ViewBindings.findChildViewById(rootView, id);
      if (btnSignUp == null) {
        break missingId;
      }

      id = R.id.checkAge;
      TextView checkAge = ViewBindings.findChildViewById(rootView, id);
      if (checkAge == null) {
        break missingId;
      }

      id = R.id.checkId;
      TextView checkId = ViewBindings.findChildViewById(rootView, id);
      if (checkId == null) {
        break missingId;
      }

      id = R.id.checkPw;
      TextView checkPw = ViewBindings.findChildViewById(rootView, id);
      if (checkPw == null) {
        break missingId;
      }

      id = R.id.checkPwSame;
      TextView checkPwSame = ViewBindings.findChildViewById(rootView, id);
      if (checkPwSame == null) {
        break missingId;
      }

      id = R.id.edtAge;
      TextInputEditText edtAge = ViewBindings.findChildViewById(rootView, id);
      if (edtAge == null) {
        break missingId;
      }

      id = R.id.edtId;
      TextInputEditText edtId = ViewBindings.findChildViewById(rootView, id);
      if (edtId == null) {
        break missingId;
      }

      id = R.id.edtName;
      TextInputEditText edtName = ViewBindings.findChildViewById(rootView, id);
      if (edtName == null) {
        break missingId;
      }

      id = R.id.edtPw;
      TextInputEditText edtPw = ViewBindings.findChildViewById(rootView, id);
      if (edtPw == null) {
        break missingId;
      }

      id = R.id.edtPwCheck;
      TextInputEditText edtPwCheck = ViewBindings.findChildViewById(rootView, id);
      if (edtPwCheck == null) {
        break missingId;
      }

      ConstraintLayout main = (ConstraintLayout) rootView;

      id = R.id.textInputLayout1;
      TextInputLayout textInputLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout1 == null) {
        break missingId;
      }

      id = R.id.textInputLayout2;
      TextInputLayout textInputLayout2 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout2 == null) {
        break missingId;
      }

      id = R.id.textInputLayout3;
      TextInputLayout textInputLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout3 == null) {
        break missingId;
      }

      id = R.id.textInputLayout4;
      TextInputLayout textInputLayout4 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout4 == null) {
        break missingId;
      }

      id = R.id.textInputLayout5;
      TextInputLayout textInputLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (textInputLayout5 == null) {
        break missingId;
      }

      id = R.id.title02;
      TextView title02 = ViewBindings.findChildViewById(rootView, id);
      if (title02 == null) {
        break missingId;
      }

      return new ActivityMainSignUpBinding((ConstraintLayout) rootView, btnClose, btnSignUp,
          checkAge, checkId, checkPw, checkPwSame, edtAge, edtId, edtName, edtPw, edtPwCheck, main,
          textInputLayout1, textInputLayout2, textInputLayout3, textInputLayout4, textInputLayout5,
          title02);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
