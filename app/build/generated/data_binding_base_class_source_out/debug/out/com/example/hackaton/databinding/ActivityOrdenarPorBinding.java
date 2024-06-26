// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.hackaton.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOrdenarPorBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView blanco;

  @NonNull
  public final TextView blanco2;

  @NonNull
  public final TextView blanco3;

  @NonNull
  public final Spinner spinnerDuraciN;

  @NonNull
  public final Spinner spinnerHoraLlegada;

  @NonNull
  public final Spinner spinnerHoraSalida;

  @NonNull
  public final Spinner spinnerPrecios;

  @NonNull
  public final TextView textDuracion;

  @NonNull
  public final TextView textFiltros;

  @NonNull
  public final TextView textHora;

  @NonNull
  public final TextView textHoraLlegada;

  @NonNull
  public final TextView textPrecios;

  @NonNull
  public final ImageButton xButton;

  private ActivityOrdenarPorBinding(@NonNull RelativeLayout rootView, @NonNull TextView blanco,
      @NonNull TextView blanco2, @NonNull TextView blanco3, @NonNull Spinner spinnerDuraciN,
      @NonNull Spinner spinnerHoraLlegada, @NonNull Spinner spinnerHoraSalida,
      @NonNull Spinner spinnerPrecios, @NonNull TextView textDuracion,
      @NonNull TextView textFiltros, @NonNull TextView textHora, @NonNull TextView textHoraLlegada,
      @NonNull TextView textPrecios, @NonNull ImageButton xButton) {
    this.rootView = rootView;
    this.blanco = blanco;
    this.blanco2 = blanco2;
    this.blanco3 = blanco3;
    this.spinnerDuraciN = spinnerDuraciN;
    this.spinnerHoraLlegada = spinnerHoraLlegada;
    this.spinnerHoraSalida = spinnerHoraSalida;
    this.spinnerPrecios = spinnerPrecios;
    this.textDuracion = textDuracion;
    this.textFiltros = textFiltros;
    this.textHora = textHora;
    this.textHoraLlegada = textHoraLlegada;
    this.textPrecios = textPrecios;
    this.xButton = xButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOrdenarPorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOrdenarPorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_ordenar_por, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOrdenarPorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.blanco;
      TextView blanco = ViewBindings.findChildViewById(rootView, id);
      if (blanco == null) {
        break missingId;
      }

      id = R.id.blanco2;
      TextView blanco2 = ViewBindings.findChildViewById(rootView, id);
      if (blanco2 == null) {
        break missingId;
      }

      id = R.id.blanco3;
      TextView blanco3 = ViewBindings.findChildViewById(rootView, id);
      if (blanco3 == null) {
        break missingId;
      }

      id = R.id.spinnerDuración;
      Spinner spinnerDuraciN = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDuraciN == null) {
        break missingId;
      }

      id = R.id.spinnerHoraLlegada;
      Spinner spinnerHoraLlegada = ViewBindings.findChildViewById(rootView, id);
      if (spinnerHoraLlegada == null) {
        break missingId;
      }

      id = R.id.spinnerHoraSalida;
      Spinner spinnerHoraSalida = ViewBindings.findChildViewById(rootView, id);
      if (spinnerHoraSalida == null) {
        break missingId;
      }

      id = R.id.spinnerPrecios;
      Spinner spinnerPrecios = ViewBindings.findChildViewById(rootView, id);
      if (spinnerPrecios == null) {
        break missingId;
      }

      id = R.id.textDuracion;
      TextView textDuracion = ViewBindings.findChildViewById(rootView, id);
      if (textDuracion == null) {
        break missingId;
      }

      id = R.id.textFiltros;
      TextView textFiltros = ViewBindings.findChildViewById(rootView, id);
      if (textFiltros == null) {
        break missingId;
      }

      id = R.id.textHora;
      TextView textHora = ViewBindings.findChildViewById(rootView, id);
      if (textHora == null) {
        break missingId;
      }

      id = R.id.textHoraLlegada;
      TextView textHoraLlegada = ViewBindings.findChildViewById(rootView, id);
      if (textHoraLlegada == null) {
        break missingId;
      }

      id = R.id.textPrecios;
      TextView textPrecios = ViewBindings.findChildViewById(rootView, id);
      if (textPrecios == null) {
        break missingId;
      }

      id = R.id.xButton;
      ImageButton xButton = ViewBindings.findChildViewById(rootView, id);
      if (xButton == null) {
        break missingId;
      }

      return new ActivityOrdenarPorBinding((RelativeLayout) rootView, blanco, blanco2, blanco3,
          spinnerDuraciN, spinnerHoraLlegada, spinnerHoraSalida, spinnerPrecios, textDuracion,
          textFiltros, textHora, textHoraLlegada, textPrecios, xButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
