// Generated by view binder compiler. Do not edit!
package com.example.hackaton.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView FiltradosText;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final Button buttonCarga;

  @NonNull
  public final Button buttonCarga2;

  @NonNull
  public final Button buttonDatosDelViajero;

  @NonNull
  public final Button buttonFiltrados;

  @NonNull
  public final Button buttonHome;

  @NonNull
  public final Button buttonInicio;

  @NonNull
  public final Button buttonLogin;

  @NonNull
  public final Button buttonPagar;

  @NonNull
  public final Button buttonPerfil;

  @NonNull
  public final Button buttonRegisteragency;

  @NonNull
  public final Button buttonRegistertourist;

  @NonNull
  public final Button buttonReservaCarro;

  @NonNull
  public final Button buttonResumenReserva;

  @NonNull
  public final TextView textNombre;

  @NonNull
  public final TextView textNombre2;

  @NonNull
  public final TextView textNombre3;

  @NonNull
  public final TextView textPantallaprueba;

  private ActivityMainBinding(@NonNull RelativeLayout rootView, @NonNull TextView FiltradosText,
      @NonNull Button button, @NonNull Button button2, @NonNull Button button3,
      @NonNull Button button4, @NonNull Button button5, @NonNull Button button6,
      @NonNull Button button7, @NonNull Button buttonCarga, @NonNull Button buttonCarga2,
      @NonNull Button buttonDatosDelViajero, @NonNull Button buttonFiltrados,
      @NonNull Button buttonHome, @NonNull Button buttonInicio, @NonNull Button buttonLogin,
      @NonNull Button buttonPagar, @NonNull Button buttonPerfil,
      @NonNull Button buttonRegisteragency, @NonNull Button buttonRegistertourist,
      @NonNull Button buttonReservaCarro, @NonNull Button buttonResumenReserva,
      @NonNull TextView textNombre, @NonNull TextView textNombre2, @NonNull TextView textNombre3,
      @NonNull TextView textPantallaprueba) {
    this.rootView = rootView;
    this.FiltradosText = FiltradosText;
    this.button = button;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.buttonCarga = buttonCarga;
    this.buttonCarga2 = buttonCarga2;
    this.buttonDatosDelViajero = buttonDatosDelViajero;
    this.buttonFiltrados = buttonFiltrados;
    this.buttonHome = buttonHome;
    this.buttonInicio = buttonInicio;
    this.buttonLogin = buttonLogin;
    this.buttonPagar = buttonPagar;
    this.buttonPerfil = buttonPerfil;
    this.buttonRegisteragency = buttonRegisteragency;
    this.buttonRegistertourist = buttonRegistertourist;
    this.buttonReservaCarro = buttonReservaCarro;
    this.buttonResumenReserva = buttonResumenReserva;
    this.textNombre = textNombre;
    this.textNombre2 = textNombre2;
    this.textNombre3 = textNombre3;
    this.textPantallaprueba = textPantallaprueba;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.FiltradosText;
      TextView FiltradosText = ViewBindings.findChildViewById(rootView, id);
      if (FiltradosText == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = ViewBindings.findChildViewById(rootView, id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button_carga;
      Button buttonCarga = ViewBindings.findChildViewById(rootView, id);
      if (buttonCarga == null) {
        break missingId;
      }

      id = R.id.button_Carga2;
      Button buttonCarga2 = ViewBindings.findChildViewById(rootView, id);
      if (buttonCarga2 == null) {
        break missingId;
      }

      id = R.id.button_Datos_del_viajero;
      Button buttonDatosDelViajero = ViewBindings.findChildViewById(rootView, id);
      if (buttonDatosDelViajero == null) {
        break missingId;
      }

      id = R.id.buttonFiltrados;
      Button buttonFiltrados = ViewBindings.findChildViewById(rootView, id);
      if (buttonFiltrados == null) {
        break missingId;
      }

      id = R.id.buttonHome;
      Button buttonHome = ViewBindings.findChildViewById(rootView, id);
      if (buttonHome == null) {
        break missingId;
      }

      id = R.id.button_inicio;
      Button buttonInicio = ViewBindings.findChildViewById(rootView, id);
      if (buttonInicio == null) {
        break missingId;
      }

      id = R.id.button_login;
      Button buttonLogin = ViewBindings.findChildViewById(rootView, id);
      if (buttonLogin == null) {
        break missingId;
      }

      id = R.id.button_Pagar;
      Button buttonPagar = ViewBindings.findChildViewById(rootView, id);
      if (buttonPagar == null) {
        break missingId;
      }

      id = R.id.buttonPerfil;
      Button buttonPerfil = ViewBindings.findChildViewById(rootView, id);
      if (buttonPerfil == null) {
        break missingId;
      }

      id = R.id.button_registeragency;
      Button buttonRegisteragency = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegisteragency == null) {
        break missingId;
      }

      id = R.id.button_registertourist;
      Button buttonRegistertourist = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegistertourist == null) {
        break missingId;
      }

      id = R.id.button_Reserva_Carro;
      Button buttonReservaCarro = ViewBindings.findChildViewById(rootView, id);
      if (buttonReservaCarro == null) {
        break missingId;
      }

      id = R.id.button_Resumen_Reserva;
      Button buttonResumenReserva = ViewBindings.findChildViewById(rootView, id);
      if (buttonResumenReserva == null) {
        break missingId;
      }

      id = R.id.textNombre;
      TextView textNombre = ViewBindings.findChildViewById(rootView, id);
      if (textNombre == null) {
        break missingId;
      }

      id = R.id.textNombre2;
      TextView textNombre2 = ViewBindings.findChildViewById(rootView, id);
      if (textNombre2 == null) {
        break missingId;
      }

      id = R.id.textNombre3;
      TextView textNombre3 = ViewBindings.findChildViewById(rootView, id);
      if (textNombre3 == null) {
        break missingId;
      }

      id = R.id.text_pantallaprueba;
      TextView textPantallaprueba = ViewBindings.findChildViewById(rootView, id);
      if (textPantallaprueba == null) {
        break missingId;
      }

      return new ActivityMainBinding((RelativeLayout) rootView, FiltradosText, button, button2,
          button3, button4, button5, button6, button7, buttonCarga, buttonCarga2,
          buttonDatosDelViajero, buttonFiltrados, buttonHome, buttonInicio, buttonLogin,
          buttonPagar, buttonPerfil, buttonRegisteragency, buttonRegistertourist,
          buttonReservaCarro, buttonResumenReserva, textNombre, textNombre2, textNombre3,
          textPantallaprueba);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
