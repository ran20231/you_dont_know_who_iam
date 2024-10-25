package com.forsale.app.features.more.agents.details;

import android.os.Bundle;
import androidx.lifecycle.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: AgentDetailsFragmentArgs.kt */
/* loaded from: classes2.dex */
public final class a implements h {

    /* renamed from: b  reason: collision with root package name */
    public static final C0344a f31657b = new C0344a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f31658a;

    /* compiled from: AgentDetailsFragmentArgs.kt */
    /* renamed from: com.forsale.app.features.more.agents.details.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0344a {
        private C0344a() {
        }

        public /* synthetic */ C0344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(Bundle bundle) {
            o.i(bundle, "bundle");
            bundle.setClassLoader(a.class.getClassLoader());
            if (bundle.containsKey("agentId")) {
                return new a(bundle.getInt("agentId"));
            }
            throw new IllegalArgumentException("Required argument \"agentId\" is missing and does not have an android:defaultValue");
        }

        public final a b(k0 savedStateHandle) {
            o.i(savedStateHandle, "savedStateHandle");
            if (savedStateHandle.e("agentId")) {
                Integer num = (Integer) savedStateHandle.f("agentId");
                if (num != null) {
                    return new a(num.intValue());
                }
                throw new IllegalArgumentException("Argument \"agentId\" of type integer does not support null values");
            }
            throw new IllegalArgumentException("Required argument \"agentId\" is missing and does not have an android:defaultValue");
        }
    }

    public a(int i11) {
        this.f31658a = i11;
    }

    public static final a fromBundle(Bundle bundle) {
        return f31657b.a(bundle);
    }

    public final int a() {
        return this.f31658a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && this.f31658a == ((a) obj).f31658a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Integer.hashCode(this.f31658a);
    }

    public String toString() {
        int i11 = this.f31658a;
        return "AgentDetailsFragmentArgs(agentId=" + i11 + ")";
    }
}
