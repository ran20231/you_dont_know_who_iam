package com.forsale.app.features.welcome.update;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: AppStatusFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final C0426a f37417b = new C0426a(null);

    /* renamed from: a  reason: collision with root package name */
    private final SessionEntity.AppStatus f37418a;

    /* compiled from: AppStatusFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.welcome.update.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0426a {
        private C0426a() {
        }

        public /* synthetic */ C0426a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            SessionEntity.AppStatus appStatus;
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("appStatus")) {
                if (!Parcelable.class.isAssignableFrom(SessionEntity.AppStatus.class) && !Serializable.class.isAssignableFrom(SessionEntity.AppStatus.class)) {
                    String name = SessionEntity.AppStatus.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                appStatus = (SessionEntity.AppStatus) bundle.get("appStatus");
                if (appStatus == null) {
                    throw new IllegalArgumentException("Argument \"appStatus\" is marked as non-null but was passed a null value.");
                }
            } else {
                appStatus = SessionEntity.AppStatus.OPTIONAL_UPDATE;
            }
            return new a(appStatus);
        }

        public final a b(k0 savedStateHandle) {
            SessionEntity.AppStatus appStatus;
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("appStatus")) {
                if (!Parcelable.class.isAssignableFrom(SessionEntity.AppStatus.class) && !Serializable.class.isAssignableFrom(SessionEntity.AppStatus.class)) {
                    String name = SessionEntity.AppStatus.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                appStatus = (SessionEntity.AppStatus) savedStateHandle.f("appStatus");
                if (appStatus == null) {
                    throw new IllegalArgumentException("Argument \"appStatus\" is marked as non-null but was passed a null value");
                }
            } else {
                appStatus = SessionEntity.AppStatus.OPTIONAL_UPDATE;
            }
            return new a(appStatus);
        }
    }

    public a() {
        this(null, 1, null);
    }

    public static final a fromBundle(Bundle bundle) {
        return f37417b.a(bundle);
    }

    public final SessionEntity.AppStatus a() {
        return this.f37418a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f37418a == ((a) obj).f37418a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37418a.hashCode();
    }

    public String toString() {
        SessionEntity.AppStatus appStatus = this.f37418a;
        return "AppStatusFragmentArgs(appStatus=" + appStatus + ")";
    }

    public a(SessionEntity.AppStatus appStatus) {
        o.i(appStatus, "appStatus");
        this.f37418a = appStatus;
    }

    public /* synthetic */ a(SessionEntity.AppStatus appStatus, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? SessionEntity.AppStatus.OPTIONAL_UPDATE : appStatus);
    }
}
