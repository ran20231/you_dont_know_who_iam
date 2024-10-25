package com.forsale.app.features.welcome.greeting;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.datalayer.network.entities.SessionEntity;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: GreetingDialogFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final C0423a f37131b = new C0423a(null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f37132c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final SessionEntity.Greeting f37133a;

    /* compiled from: GreetingDialogFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.welcome.greeting.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0423a {
        private C0423a() {
        }

        public /* synthetic */ C0423a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("greeting")) {
                if (!Parcelable.class.isAssignableFrom(SessionEntity.Greeting.class) && !Serializable.class.isAssignableFrom(SessionEntity.Greeting.class)) {
                    String name = SessionEntity.Greeting.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                SessionEntity.Greeting greeting = (SessionEntity.Greeting) bundle.get("greeting");
                if (greeting != null) {
                    return new a(greeting);
                }
                throw new IllegalArgumentException("Argument \"greeting\" is marked as non-null but was passed a null value.");
            }
            throw new IllegalArgumentException("Required argument \"greeting\" is missing and does not have an android:defaultValue");
        }

        public final a b(k0 savedStateHandle) {
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("greeting")) {
                if (!Parcelable.class.isAssignableFrom(SessionEntity.Greeting.class) && !Serializable.class.isAssignableFrom(SessionEntity.Greeting.class)) {
                    String name = SessionEntity.Greeting.class.getName();
                    throw new UnsupportedOperationException(name + " must implement Parcelable or Serializable or must be an Enum.");
                }
                SessionEntity.Greeting greeting = (SessionEntity.Greeting) savedStateHandle.f("greeting");
                if (greeting != null) {
                    return new a(greeting);
                }
                throw new IllegalArgumentException("Argument \"greeting\" is marked as non-null but was passed a null value");
            }
            throw new IllegalArgumentException("Required argument \"greeting\" is missing and does not have an android:defaultValue");
        }
    }

    public a(SessionEntity.Greeting greeting) {
        o.i(greeting, "greeting");
        this.f37133a = greeting;
    }

    public static final a fromBundle(Bundle bundle) {
        return f37131b.a(bundle);
    }

    public final SessionEntity.Greeting a() {
        return this.f37133a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && o.d(this.f37133a, ((a) obj).f37133a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f37133a.hashCode();
    }

    public String toString() {
        SessionEntity.Greeting greeting = this.f37133a;
        return "GreetingDialogFragmentArgs(greeting=" + greeting + ")";
    }
}
