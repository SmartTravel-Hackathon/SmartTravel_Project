// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hackaton.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final EditText correoid;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final Button loginButtonAgencia;

  @NonNull
  public final Button loginButtonTurista;

  @NonNull
  public final TextView textViewRegister;

  @NonNull
  public final TextView textViewSignUp;

  @NonNull
  public final TextView textViewTitle;

  private LoginBinding(@NonNull RelativeLayout rootView, @NonNull EditText correoid,
      @NonNull EditText editTextTextPassword, @NonNull Button loginButtonAgencia,
      @NonNull Button loginButtonTurista, @NonNull TextView textViewRegister,
      @NonNull TextView textViewSignUp, @NonNull TextView textViewTitle) {
    this.rootView = rootView;
    this.correoid = correoid;
    this.editTextTextPassword = editTextTextPassword;
    this.loginButtonAgencia = loginButtonAgencia;
    this.loginButtonTurista = loginButtonTurista;
    this.textViewRegister = textViewRegister;
    this.textViewSignUp = textViewSignUp;
    this.textViewTitle = textViewTitle;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.login, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.correoid;
      EditText correoid = ViewBindings.findChildViewById(rootView, id);
      if (correoid == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.loginButtonAgencia;
      Button loginButtonAgencia = ViewBindings.findChildViewById(rootView, id);
      if (loginButtonAgencia == null) {
        break missingId;
      }

      id = R.id.loginButtonTurista;
      Button loginButtonTurista = ViewBindings.findChildViewById(rootView, id);
      if (loginButtonTurista == null) {
        break missingId;
      }

      id = R.id.textViewRegister;
      TextView textViewRegister = ViewBindings.findChildViewById(rootView, id);
      if (textViewRegister == null) {
        break missingId;
      }

      id = R.id.textViewSignUp;
      TextView textViewSignUp = ViewBindings.findChildViewById(rootView, id);
      if (textViewSignUp == null) {
        break missingId;
      }

      id = R.id.textViewTitle;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      return new LoginBinding((RelativeLayout) rootView, correoid, editTextTextPassword,
          loginButtonAgencia, loginButtonTurista, textViewRegister, textViewSignUp, textViewTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
