package com.forsale.app.base.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.g;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import androidx.lifecycle.s;
import com.forsale.app.features.categories.home.maincategories.MainCategoriesFragment;
import com.forsale.app.features.maincontainer.MainContainerActivity;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.buymoretoken.billingpackage.BillingPackageFragment;
import com.forsale.app.features.more.wanteditems.WantedItemsFragment;
import com.forsale.app.features.postad.PLFActivity;
import com.forsale.app.features.welcome.update.AppStatusFragment;
import com.forsale.app.utils.ViewsExtensionsKt;
import com.google.android.material.snackbar.Snackbar;
import g00.l;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import t9.y0;
import w9.c;
/* compiled from: BaseFragment.kt */
/* loaded from: classes2.dex */
public abstract class a<B extends ViewDataBinding> extends Fragment implements CoroutineScope {

    /* renamed from: b  reason: collision with root package name */
    private final c f22206b;

    /* renamed from: e  reason: collision with root package name */
    private B f22209e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f22210f;

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineContext f22205a = Dispatchers.getIO();

    /* renamed from: c  reason: collision with root package name */
    private final int f22207c = y0.Q3;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f22208d = true;

    private final void r(boolean z11) {
        MainContainerActivity mainContainerActivity;
        if (z11 && k()) {
            p activity = getActivity();
            if (activity instanceof MainContainerActivity) {
                mainContainerActivity = (MainContainerActivity) activity;
            } else {
                mainContainerActivity = null;
            }
            if (mainContainerActivity != null) {
                mainContainerActivity.A1();
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f22205a;
    }

    public final boolean k() {
        if (!(this instanceof MainCategoriesFragment) && !(this instanceof AppStatusFragment) && !(this instanceof BillingPackageFragment) && !(this instanceof WantedItemsFragment) && !(getActivity() instanceof WebActivity) && !(getActivity() instanceof PLFActivity)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final B m() {
        if (this.f22210f) {
            B b11 = this.f22209e;
            if (b11 == null) {
                o.w("privateBinding");
                return null;
            }
            return b11;
        }
        throw new IllegalStateException("binding should be not null at this state.");
    }

    protected abstract int o();

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Integer a11;
        o.i(menu, "menu");
        o.i(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        c q11 = q();
        if (q11 != null && (a11 = q11.a()) != null) {
            inflater.inflate(a11.intValue(), menu);
            l<Menu, wz.p> b11 = q11.b();
            if (b11 != null) {
                b11.invoke(menu);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z11;
        o.i(inflater, "inflater");
        if (q() != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        setHasOptionsMenu(z11);
        this.f22210f = true;
        B b11 = this.f22209e;
        if (b11 != null) {
            if (b11 == null) {
                o.w("privateBinding");
                b11 = null;
            }
            return b11.getRoot();
        }
        B b12 = (B) g.h(inflater, o(), viewGroup, false);
        o.f(b12);
        this.f22209e = b12;
        return b12.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        JobKt__JobKt.cancelChildren$default(getCoroutineContext(), null, 1, null);
        JobKt__JobKt.cancel$default(getCoroutineContext(), null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f22210f = false;
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        l<MenuItem, Boolean> c11;
        Boolean invoke;
        o.i(item, "item");
        c q11 = q();
        if (q11 != null && (c11 = q11.c()) != null && (invoke = c11.invoke(item)) != null) {
            return invoke.booleanValue();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        m().U(getViewLifecycleOwner());
        r(p());
    }

    public boolean p() {
        return this.f22208d;
    }

    public c q() {
        return this.f22206b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(String message) {
        o.i(message, "message");
        Snackbar p02 = Snackbar.p0(m().getRoot(), message, 0);
        o.f(p02);
        s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ViewsExtensionsKt.B(p02, viewLifecycleOwner);
        p02.Z();
    }
}
