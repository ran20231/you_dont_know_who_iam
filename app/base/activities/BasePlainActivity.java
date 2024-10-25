package com.forsale.app.base.activities;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.appcompat.app.BaseContextWrappingDelegate;
import androidx.appcompat.app.d;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import com.google.android.material.snackbar.Snackbar;
import g00.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import wz.h;
/* compiled from: BasePlainActivity.kt */
/* loaded from: classes2.dex */
public abstract class BasePlainActivity<B extends ViewDataBinding> extends d implements CoroutineScope {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f22047a = Dispatchers.getMain();

    /* renamed from: b  reason: collision with root package name */
    private final h f22048b;

    /* renamed from: c  reason: collision with root package name */
    private final h f22049c;

    public BasePlainActivity() {
        h a11;
        h a12;
        a11 = kotlin.d.a(new a<B>(this) { // from class: com.forsale.app.base.activities.BasePlainActivity$binding$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BasePlainActivity<B> f22051a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f22051a = this;
            }

            /* JADX WARN: Incorrect return type in method signature: ()TB; */
            @Override // g00.a
            /* renamed from: b */
            public final ViewDataBinding invoke() {
                BasePlainActivity<B> basePlainActivity = this.f22051a;
                return g.j(basePlainActivity, basePlainActivity.p0());
            }
        });
        this.f22048b = a11;
        a12 = kotlin.d.a(new a<BaseContextWrappingDelegate>(this) { // from class: com.forsale.app.base.activities.BasePlainActivity$baseContextWrappingDelegate$2

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ BasePlainActivity<B> f22050a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f22050a = this;
            }

            @Override // g00.a
            /* renamed from: b */
            public final BaseContextWrappingDelegate invoke() {
                androidx.appcompat.app.g delegate;
                delegate = super/*androidx.appcompat.app.d*/.getDelegate();
                o.h(delegate, "access$getDelegate$s-847601390(...)");
                return new BaseContextWrappingDelegate(delegate);
            }
        });
        this.f22049c = a12;
    }

    private final androidx.appcompat.app.g m0() {
        return (androidx.appcompat.app.g) this.f22049c.getValue();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context createConfigurationContext(Configuration overrideConfiguration) {
        Object runBlocking$default;
        o.i(overrideConfiguration, "overrideConfiguration");
        Context createConfigurationContext = super.createConfigurationContext(overrideConfiguration);
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new BasePlainActivity$createConfigurationContext$1(createConfigurationContext, null), 1, null);
        super.attachBaseContext((Context) runBlocking$default);
        o.f(createConfigurationContext);
        return createConfigurationContext;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f22047a;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.g getDelegate() {
        return m0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final B o0() {
        Object value = this.f22048b.getValue();
        o.h(value, "getValue(...)");
        return (B) value;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o0().U(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), null, 1, null);
        JobKt__JobKt.cancel$default(getCoroutineContext(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int p0();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q0(String message) {
        o.i(message, "message");
        Snackbar.p0(o0().getRoot(), message, 0).Z();
    }
}
