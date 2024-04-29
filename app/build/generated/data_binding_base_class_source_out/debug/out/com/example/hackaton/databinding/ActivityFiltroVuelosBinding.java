// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.RadioButton;
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

public final class ActivityFiltroVuelosBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton antesButton;

  @NonNull
  public final RadioButton aviancaButton;

  @NonNull
  public final TextView blanco;

  @NonNull
  public final TextView blanco2;

  @NonNull
  public final TextView blanco3;

  @NonNull
  public final CheckBox checkBoxPrecios;

  @NonNull
  public final RadioButton copaButton;

  @NonNull
  public final RadioButton latamButton;

  @NonNull
  public final RadioButton masDeUnaEscalaButton;

  @NonNull
  public final TextView rangoPrecios;

  @NonNull
  public final RadioButton seisAMButton;

  @NonNull
  public final RadioButton sinEscalasButton;

  @NonNull
  public final TextView textAerolineas;

  @NonNull
  public final TextView textFiltros;

  @NonNull
  public final TextView textHorarios;

  @NonNull
  public final RadioButton unaEscalaButton;

  @NonNull
  public final RadioButton wingoButton;

  @NonNull
  public final ImageButton xButton;

  private ActivityFiltroVuelosBinding(@NonNull RelativeLayout rootView,
      @NonNull RadioButton antesButton, @NonNull RadioButton aviancaButton,
      @NonNull TextView blanco, @NonNull TextView blanco2, @NonNull TextView blanco3,
      @NonNull CheckBox checkBoxPrecios, @NonNull RadioButton copaButton,
      @NonNull RadioButton latamButton, @NonNull RadioButton masDeUnaEscalaButton,
      @NonNull TextView rangoPrecios, @NonNull RadioButton seisAMButton,
      @NonNull RadioButton sinEscalasButton, @NonNull TextView textAerolineas,
      @NonNull TextView textFiltros, @NonNull TextView textHorarios,
      @NonNull RadioButton unaEscalaButton, @NonNull RadioButton wingoButton,
      @NonNull ImageButton xButton) {
    this.rootView = rootView;
    this.antesButton = antesButton;
    this.aviancaButton = aviancaButton;
    this.blanco = blanco;
    this.blanco2 = blanco2;
    this.blanco3 = blanco3;
    this.checkBoxPrecios = checkBoxPrecios;
    this.copaButton = copaButton;
    this.latamButton = latamButton;
    this.masDeUnaEscalaButton = masDeUnaEscalaButton;
    this.rangoPrecios = rangoPrecios;
    this.seisAMButton = seisAMButton;
    this.sinEscalasButton = sinEscalasButton;
    this.textAerolineas = textAerolineas;
    this.textFiltros = textFiltros;
    this.textHorarios = textHorarios;
    this.unaEscalaButton = unaEscalaButton;
    this.wingoButton = wingoButton;
    this.xButton = xButton;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFiltroVuelosBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFiltroVuelosBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_filtro_vuelos, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFiltroVuelosBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.antesButton;
      RadioButton antesButton = ViewBindings.findChildViewById(rootView, id);
      if (antesButton == null) {
        break missingId;
      }

      id = R.id.aviancaButton;
      RadioButton aviancaButton = ViewBindings.findChildViewById(rootView, id);
      if (aviancaButton == null) {
        break missingId;
      }

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

      id = R.id.checkBoxPrecios;
      CheckBox checkBoxPrecios = ViewBindings.findChildViewById(rootView, id);
      if (checkBoxPrecios == null) {
        break missingId;
      }

      id = R.id.copaButton;
      RadioButton copaButton = ViewBindings.findChildViewById(rootView, id);
      if (copaButton == null) {
        break missingId;
      }

      id = R.id.latamButton;
      RadioButton latamButton = ViewBindings.findChildViewById(rootView, id);
      if (latamButton == null) {
        break missingId;
      }

      id = R.id.masDeUnaEscalaButton;
      RadioButton masDeUnaEscalaButton = ViewBindings.findChildViewById(rootView, id);
      if (masDeUnaEscalaButton == null) {
        break missingId;
      }

      id = R.id.rangoPrecios;
      TextView rangoPrecios = ViewBindings.findChildViewById(rootView, id);
      if (rangoPrecios == null) {
        break missingId;
      }

      id = R.id.seisAMButton;
      RadioButton seisAMButton = ViewBindings.findChildViewById(rootView, id);
      if (seisAMButton == null) {
        break missingId;
      }

      id = R.id.sinEscalasButton;
      RadioButton sinEscalasButton = ViewBindings.findChildViewById(rootView, id);
      if (sinEscalasButton == null) {
        break missingId;
      }

      id = R.id.textAerolineas;
      TextView textAerolineas = ViewBindings.findChildViewById(rootView, id);
      if (textAerolineas == null) {
        break missingId;
      }

      id = R.id.textFiltros;
      TextView textFiltros = ViewBindings.findChildViewById(rootView, id);
      if (textFiltros == null) {
        break missingId;
      }

      id = R.id.textHorarios;
      TextView textHorarios = ViewBindings.findChildViewById(rootView, id);
      if (textHorarios == null) {
        break missingId;
      }

      id = R.id.unaEscalaButton;
      RadioButton unaEscalaButton = ViewBindings.findChildViewById(rootView, id);
      if (unaEscalaButton == null) {
        break missingId;
      }

      id = R.id.wingoButton;
      RadioButton wingoButton = ViewBindings.findChildViewById(rootView, id);
      if (wingoButton == null) {
        break missingId;
      }

      id = R.id.xButton;
      ImageButton xButton = ViewBindings.findChildViewById(rootView, id);
      if (xButton == null) {
        break missingId;
      }

      return new ActivityFiltroVuelosBinding((RelativeLayout) rootView, antesButton, aviancaButton,
          blanco, blanco2, blanco3, checkBoxPrecios, copaButton, latamButton, masDeUnaEscalaButton,
          rangoPrecios, seisAMButton, sinEscalasButton, textAerolineas, textFiltros, textHorarios,
          unaEscalaButton, wingoButton, xButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}