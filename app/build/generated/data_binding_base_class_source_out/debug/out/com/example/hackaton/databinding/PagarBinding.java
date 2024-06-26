// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
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

public final class PagarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton Buttonx1;

  @NonNull
  public final ImageButton Buttonx3;

  @NonNull
  public final ImageButton imageViewPSE;

  @NonNull
  public final ImageButton imageViewTarjeta;

  @NonNull
  public final RelativeLayout mPSE;

  @NonNull
  public final RelativeLayout mPuntos;

  @NonNull
  public final RelativeLayout metodoPago;

  @NonNull
  public final View space1;

  @NonNull
  public final View space2;

  @NonNull
  public final View space3;

  @NonNull
  public final TextView textViewMetodoPago;

  @NonNull
  public final TextView textViewPSE;

  @NonNull
  public final TextView textViewPagar;

  @NonNull
  public final TextView textViewPoliticas;

  @NonNull
  public final TextView textViewPuntos;

  @NonNull
  public final TextView textViewTarjeta;

  @NonNull
  public final TextView textViewValorDinero;

  @NonNull
  public final TextView textViewValorTotal;

  private PagarBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton Buttonx1,
      @NonNull ImageButton Buttonx3, @NonNull ImageButton imageViewPSE,
      @NonNull ImageButton imageViewTarjeta, @NonNull RelativeLayout mPSE,
      @NonNull RelativeLayout mPuntos, @NonNull RelativeLayout metodoPago, @NonNull View space1,
      @NonNull View space2, @NonNull View space3, @NonNull TextView textViewMetodoPago,
      @NonNull TextView textViewPSE, @NonNull TextView textViewPagar,
      @NonNull TextView textViewPoliticas, @NonNull TextView textViewPuntos,
      @NonNull TextView textViewTarjeta, @NonNull TextView textViewValorDinero,
      @NonNull TextView textViewValorTotal) {
    this.rootView = rootView;
    this.Buttonx1 = Buttonx1;
    this.Buttonx3 = Buttonx3;
    this.imageViewPSE = imageViewPSE;
    this.imageViewTarjeta = imageViewTarjeta;
    this.mPSE = mPSE;
    this.mPuntos = mPuntos;
    this.metodoPago = metodoPago;
    this.space1 = space1;
    this.space2 = space2;
    this.space3 = space3;
    this.textViewMetodoPago = textViewMetodoPago;
    this.textViewPSE = textViewPSE;
    this.textViewPagar = textViewPagar;
    this.textViewPoliticas = textViewPoliticas;
    this.textViewPuntos = textViewPuntos;
    this.textViewTarjeta = textViewTarjeta;
    this.textViewValorDinero = textViewValorDinero;
    this.textViewValorTotal = textViewValorTotal;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static PagarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PagarBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.pagar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PagarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Buttonx1;
      ImageButton Buttonx1 = ViewBindings.findChildViewById(rootView, id);
      if (Buttonx1 == null) {
        break missingId;
      }

      id = R.id.Buttonx3;
      ImageButton Buttonx3 = ViewBindings.findChildViewById(rootView, id);
      if (Buttonx3 == null) {
        break missingId;
      }

      id = R.id.imageViewPSE;
      ImageButton imageViewPSE = ViewBindings.findChildViewById(rootView, id);
      if (imageViewPSE == null) {
        break missingId;
      }

      id = R.id.imageViewTarjeta;
      ImageButton imageViewTarjeta = ViewBindings.findChildViewById(rootView, id);
      if (imageViewTarjeta == null) {
        break missingId;
      }

      id = R.id.mPSE;
      RelativeLayout mPSE = ViewBindings.findChildViewById(rootView, id);
      if (mPSE == null) {
        break missingId;
      }

      id = R.id.mPuntos;
      RelativeLayout mPuntos = ViewBindings.findChildViewById(rootView, id);
      if (mPuntos == null) {
        break missingId;
      }

      id = R.id.metodo_pago;
      RelativeLayout metodoPago = ViewBindings.findChildViewById(rootView, id);
      if (metodoPago == null) {
        break missingId;
      }

      id = R.id.space1;
      View space1 = ViewBindings.findChildViewById(rootView, id);
      if (space1 == null) {
        break missingId;
      }

      id = R.id.space2;
      View space2 = ViewBindings.findChildViewById(rootView, id);
      if (space2 == null) {
        break missingId;
      }

      id = R.id.space3;
      View space3 = ViewBindings.findChildViewById(rootView, id);
      if (space3 == null) {
        break missingId;
      }

      id = R.id.textViewMetodoPago;
      TextView textViewMetodoPago = ViewBindings.findChildViewById(rootView, id);
      if (textViewMetodoPago == null) {
        break missingId;
      }

      id = R.id.textViewPSE;
      TextView textViewPSE = ViewBindings.findChildViewById(rootView, id);
      if (textViewPSE == null) {
        break missingId;
      }

      id = R.id.textViewPagar;
      TextView textViewPagar = ViewBindings.findChildViewById(rootView, id);
      if (textViewPagar == null) {
        break missingId;
      }

      id = R.id.textViewPoliticas;
      TextView textViewPoliticas = ViewBindings.findChildViewById(rootView, id);
      if (textViewPoliticas == null) {
        break missingId;
      }

      id = R.id.textViewPuntos;
      TextView textViewPuntos = ViewBindings.findChildViewById(rootView, id);
      if (textViewPuntos == null) {
        break missingId;
      }

      id = R.id.textViewTarjeta;
      TextView textViewTarjeta = ViewBindings.findChildViewById(rootView, id);
      if (textViewTarjeta == null) {
        break missingId;
      }

      id = R.id.textViewValorDinero;
      TextView textViewValorDinero = ViewBindings.findChildViewById(rootView, id);
      if (textViewValorDinero == null) {
        break missingId;
      }

      id = R.id.textViewValorTotal;
      TextView textViewValorTotal = ViewBindings.findChildViewById(rootView, id);
      if (textViewValorTotal == null) {
        break missingId;
      }

      return new PagarBinding((RelativeLayout) rootView, Buttonx1, Buttonx3, imageViewPSE,
          imageViewTarjeta, mPSE, mPuntos, metodoPago, space1, space2, space3, textViewMetodoPago,
          textViewPSE, textViewPagar, textViewPoliticas, textViewPuntos, textViewTarjeta,
          textViewValorDinero, textViewValorTotal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
