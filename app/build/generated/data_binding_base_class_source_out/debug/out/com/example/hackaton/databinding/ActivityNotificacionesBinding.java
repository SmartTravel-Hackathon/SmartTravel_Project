// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
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

public final class ActivityNotificacionesBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout NotificacionesSistema;

  @NonNull
  public final RelativeLayout Sugerencias;

  @NonNull
  public final TextView blanco;

  @NonNull
  public final TextView blanco2;

  @NonNull
  public final Button buttonRevisarDatos;

  @NonNull
  public final Button buttonVerRestaurante;

  @NonNull
  public final Button buttonVerViaje;

  @NonNull
  public final ImageButton iconoAccount;

  @NonNull
  public final ImageButton iconoHome;

  @NonNull
  public final ImageButton iconoMisViajes;

  @NonNull
  public final ImageButton iconoNotificaciones;

  @NonNull
  public final ImageButton iconoPlanes;

  @NonNull
  public final ImageView imageDestino2;

  @NonNull
  public final ImageView imageError;

  @NonNull
  public final ImageView imageFlecha2;

  @NonNull
  public final ImageView imageMapa;

  @NonNull
  public final TextView textDireccion;

  @NonNull
  public final TextView textDuracionViaje2;

  @NonNull
  public final TextView textError;

  @NonNull
  public final TextView textNotificaciones;

  @NonNull
  public final TextView textNotificacionesSis;

  @NonNull
  public final TextView textPais;

  @NonNull
  public final TextView textRestaurante;

  @NonNull
  public final TextView textSugerencias;

  @NonNull
  public final TextView textViaje3;

  @NonNull
  public final TextView textViaje4;

  private ActivityNotificacionesBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout NotificacionesSistema, @NonNull RelativeLayout Sugerencias,
      @NonNull TextView blanco, @NonNull TextView blanco2, @NonNull Button buttonRevisarDatos,
      @NonNull Button buttonVerRestaurante, @NonNull Button buttonVerViaje,
      @NonNull ImageButton iconoAccount, @NonNull ImageButton iconoHome,
      @NonNull ImageButton iconoMisViajes, @NonNull ImageButton iconoNotificaciones,
      @NonNull ImageButton iconoPlanes, @NonNull ImageView imageDestino2,
      @NonNull ImageView imageError, @NonNull ImageView imageFlecha2, @NonNull ImageView imageMapa,
      @NonNull TextView textDireccion, @NonNull TextView textDuracionViaje2,
      @NonNull TextView textError, @NonNull TextView textNotificaciones,
      @NonNull TextView textNotificacionesSis, @NonNull TextView textPais,
      @NonNull TextView textRestaurante, @NonNull TextView textSugerencias,
      @NonNull TextView textViaje3, @NonNull TextView textViaje4) {
    this.rootView = rootView;
    this.NotificacionesSistema = NotificacionesSistema;
    this.Sugerencias = Sugerencias;
    this.blanco = blanco;
    this.blanco2 = blanco2;
    this.buttonRevisarDatos = buttonRevisarDatos;
    this.buttonVerRestaurante = buttonVerRestaurante;
    this.buttonVerViaje = buttonVerViaje;
    this.iconoAccount = iconoAccount;
    this.iconoHome = iconoHome;
    this.iconoMisViajes = iconoMisViajes;
    this.iconoNotificaciones = iconoNotificaciones;
    this.iconoPlanes = iconoPlanes;
    this.imageDestino2 = imageDestino2;
    this.imageError = imageError;
    this.imageFlecha2 = imageFlecha2;
    this.imageMapa = imageMapa;
    this.textDireccion = textDireccion;
    this.textDuracionViaje2 = textDuracionViaje2;
    this.textError = textError;
    this.textNotificaciones = textNotificaciones;
    this.textNotificacionesSis = textNotificacionesSis;
    this.textPais = textPais;
    this.textRestaurante = textRestaurante;
    this.textSugerencias = textSugerencias;
    this.textViaje3 = textViaje3;
    this.textViaje4 = textViaje4;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNotificacionesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNotificacionesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notificaciones, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNotificacionesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.NotificacionesSistema;
      RelativeLayout NotificacionesSistema = ViewBindings.findChildViewById(rootView, id);
      if (NotificacionesSistema == null) {
        break missingId;
      }

      id = R.id.Sugerencias;
      RelativeLayout Sugerencias = ViewBindings.findChildViewById(rootView, id);
      if (Sugerencias == null) {
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

      id = R.id.buttonRevisarDatos;
      Button buttonRevisarDatos = ViewBindings.findChildViewById(rootView, id);
      if (buttonRevisarDatos == null) {
        break missingId;
      }

      id = R.id.buttonVerRestaurante;
      Button buttonVerRestaurante = ViewBindings.findChildViewById(rootView, id);
      if (buttonVerRestaurante == null) {
        break missingId;
      }

      id = R.id.buttonVerViaje;
      Button buttonVerViaje = ViewBindings.findChildViewById(rootView, id);
      if (buttonVerViaje == null) {
        break missingId;
      }

      id = R.id.iconoAccount;
      ImageButton iconoAccount = ViewBindings.findChildViewById(rootView, id);
      if (iconoAccount == null) {
        break missingId;
      }

      id = R.id.iconoHome;
      ImageButton iconoHome = ViewBindings.findChildViewById(rootView, id);
      if (iconoHome == null) {
        break missingId;
      }

      id = R.id.iconoMisViajes;
      ImageButton iconoMisViajes = ViewBindings.findChildViewById(rootView, id);
      if (iconoMisViajes == null) {
        break missingId;
      }

      id = R.id.iconoNotificaciones;
      ImageButton iconoNotificaciones = ViewBindings.findChildViewById(rootView, id);
      if (iconoNotificaciones == null) {
        break missingId;
      }

      id = R.id.iconoPlanes;
      ImageButton iconoPlanes = ViewBindings.findChildViewById(rootView, id);
      if (iconoPlanes == null) {
        break missingId;
      }

      id = R.id.imageDestino2;
      ImageView imageDestino2 = ViewBindings.findChildViewById(rootView, id);
      if (imageDestino2 == null) {
        break missingId;
      }

      id = R.id.imageError;
      ImageView imageError = ViewBindings.findChildViewById(rootView, id);
      if (imageError == null) {
        break missingId;
      }

      id = R.id.imageFlecha2;
      ImageView imageFlecha2 = ViewBindings.findChildViewById(rootView, id);
      if (imageFlecha2 == null) {
        break missingId;
      }

      id = R.id.imageMapa;
      ImageView imageMapa = ViewBindings.findChildViewById(rootView, id);
      if (imageMapa == null) {
        break missingId;
      }

      id = R.id.textDireccion;
      TextView textDireccion = ViewBindings.findChildViewById(rootView, id);
      if (textDireccion == null) {
        break missingId;
      }

      id = R.id.textDuracionViaje2;
      TextView textDuracionViaje2 = ViewBindings.findChildViewById(rootView, id);
      if (textDuracionViaje2 == null) {
        break missingId;
      }

      id = R.id.textError;
      TextView textError = ViewBindings.findChildViewById(rootView, id);
      if (textError == null) {
        break missingId;
      }

      id = R.id.textNotificaciones;
      TextView textNotificaciones = ViewBindings.findChildViewById(rootView, id);
      if (textNotificaciones == null) {
        break missingId;
      }

      id = R.id.textNotificacionesSis;
      TextView textNotificacionesSis = ViewBindings.findChildViewById(rootView, id);
      if (textNotificacionesSis == null) {
        break missingId;
      }

      id = R.id.textPais;
      TextView textPais = ViewBindings.findChildViewById(rootView, id);
      if (textPais == null) {
        break missingId;
      }

      id = R.id.textRestaurante;
      TextView textRestaurante = ViewBindings.findChildViewById(rootView, id);
      if (textRestaurante == null) {
        break missingId;
      }

      id = R.id.textSugerencias;
      TextView textSugerencias = ViewBindings.findChildViewById(rootView, id);
      if (textSugerencias == null) {
        break missingId;
      }

      id = R.id.textViaje3;
      TextView textViaje3 = ViewBindings.findChildViewById(rootView, id);
      if (textViaje3 == null) {
        break missingId;
      }

      id = R.id.textViaje4;
      TextView textViaje4 = ViewBindings.findChildViewById(rootView, id);
      if (textViaje4 == null) {
        break missingId;
      }

      return new ActivityNotificacionesBinding((RelativeLayout) rootView, NotificacionesSistema,
          Sugerencias, blanco, blanco2, buttonRevisarDatos, buttonVerRestaurante, buttonVerViaje,
          iconoAccount, iconoHome, iconoMisViajes, iconoNotificaciones, iconoPlanes, imageDestino2,
          imageError, imageFlecha2, imageMapa, textDireccion, textDuracionViaje2, textError,
          textNotificaciones, textNotificacionesSis, textPais, textRestaurante, textSugerencias,
          textViaje3, textViaje4);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}