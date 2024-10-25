package com.forsale.app.features.auth.views.textfieldstates;

import androidx.compose.runtime.c0;
import com.forsale.app.features.auth.interactors.validationinteractors.h;
import g00.l;
import j0.k0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import rj.a;
/* compiled from: TextFieldState.kt */
/* loaded from: classes2.dex */
public class TextFieldState {

    /* renamed from: a  reason: collision with root package name */
    private final l<String, h> f23192a;

    /* renamed from: b  reason: collision with root package name */
    private final StateFlow<rj.a> f23193b;

    /* renamed from: c  reason: collision with root package name */
    private final k0 f23194c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f23195d;

    /* renamed from: e  reason: collision with root package name */
    private final k0 f23196e;

    /* renamed from: f  reason: collision with root package name */
    private final k0 f23197f;

    /* renamed from: g  reason: collision with root package name */
    private final k0 f23198g;

    public TextFieldState() {
        this(null, null, 3, null);
    }

    private final boolean b() {
        return ((Boolean) this.f23198g.getValue()).booleanValue();
    }

    private final void i(boolean z11) {
        this.f23198g.setValue(Boolean.valueOf(z11));
    }

    public final void a() {
        if (f()) {
            i(true);
        }
    }

    public final StateFlow<rj.a> c() {
        return this.f23193b;
    }

    public final boolean d() {
        return ((Boolean) this.f23197f.getValue()).booleanValue();
    }

    public final String e() {
        return (String) this.f23194c.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.f23195d.getValue()).booleanValue();
    }

    public boolean g() {
        return this.f23192a.invoke(e()) instanceof h.b;
    }

    public final void h(boolean z11) {
        j(z11);
        if (z11) {
            k(true);
        }
    }

    public final void j(boolean z11) {
        this.f23196e.setValue(Boolean.valueOf(z11));
    }

    public final void k(boolean z11) {
        this.f23195d.setValue(Boolean.valueOf(z11));
    }

    public final void l(boolean z11) {
        this.f23197f.setValue(Boolean.valueOf(z11));
    }

    public final void m(String str) {
        o.i(str, "<set-?>");
        this.f23194c.setValue(str);
    }

    public final boolean n() {
        if ((!g() && b()) || d()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldState(l<? super String, ? extends h> validator, StateFlow<? extends rj.a> errorMessage) {
        k0 e11;
        k0 e12;
        k0 e13;
        k0 e14;
        k0 e15;
        o.i(validator, "validator");
        o.i(errorMessage, "errorMessage");
        this.f23192a = validator;
        this.f23193b = errorMessage;
        e11 = c0.e("", null, 2, null);
        this.f23194c = e11;
        Boolean bool = Boolean.FALSE;
        e12 = c0.e(bool, null, 2, null);
        this.f23195d = e12;
        e13 = c0.e(bool, null, 2, null);
        this.f23196e = e13;
        e14 = c0.e(bool, null, 2, null);
        this.f23197f = e14;
        e15 = c0.e(bool, null, 2, null);
        this.f23198g = e15;
    }

    public /* synthetic */ TextFieldState(l lVar, StateFlow stateFlow, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new l<String, h.b>() { // from class: com.forsale.app.features.auth.views.textfieldstates.TextFieldState.1
            @Override // g00.l
            /* renamed from: b */
            public final h.b invoke(String it2) {
                o.i(it2, "it");
                return h.b.f22741a;
            }
        } : lVar, (i11 & 2) != 0 ? StateFlowKt.MutableStateFlow(new a.C0804a("")) : stateFlow);
    }
}
