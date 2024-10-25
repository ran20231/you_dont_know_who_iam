package com.forsale.app.base.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.c0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.ui.StatefulLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import t9.t0;
import v9.c;
/* compiled from: BaseStatefulFragment.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes2.dex */
public abstract class b<B extends ViewDataBinding, VM extends BaseStatefulViewModel> extends BaseViewModelFragment<B, VM> implements c {

    /* renamed from: i  reason: collision with root package name */
    private final int f22211i = t0.Y0;

    /* renamed from: j  reason: collision with root package name */
    private final int f22212j = t0.V0;

    /* renamed from: x  reason: collision with root package name */
    private final int f22213x = t0.S0;

    /* renamed from: y  reason: collision with root package name */
    private final int f22214y = t0.T0;

    /* compiled from: BaseStatefulFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<ViewStates> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StatefulLayout f22215a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b<B, VM> f22216b;

        /* compiled from: BaseStatefulFragment.kt */
        /* renamed from: com.forsale.app.base.fragments.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0250a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22217a;

            static {
                int[] iArr = new int[ViewStates.values().length];
                try {
                    iArr[ViewStates.CONTENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ViewStates.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ViewStates.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ViewStates.CONNECTION_ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ViewStates.Empty.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f22217a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(StatefulLayout statefulLayout, b<B, ? extends VM> bVar) {
            this.f22215a = statefulLayout;
            this.f22216b = bVar;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ViewStates viewStates) {
            if (viewStates != null) {
                StatefulLayout statefulLayout = this.f22215a;
                b<B, VM> bVar = this.f22216b;
                int i11 = C0250a.f22217a[viewStates.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    statefulLayout.b(bVar.G(), bVar);
                                }
                            } else {
                                statefulLayout.b(bVar.E(), bVar);
                            }
                        } else {
                            statefulLayout.b(bVar.H(), bVar);
                        }
                    } else {
                        statefulLayout.b(bVar.I(), bVar);
                    }
                } else {
                    statefulLayout.d();
                }
                bVar.J(viewStates);
            }
        }
    }

    private final boolean C(ViewGroup viewGroup) {
        for (View view : ViewGroupKt.a(viewGroup)) {
            if (view instanceof StatefulLayout) {
                return false;
            }
        }
        return true;
    }

    private final StatefulLayout D(ViewGroup viewGroup) {
        View view;
        Iterator<View> it2 = ViewGroupKt.a(viewGroup).iterator();
        while (true) {
            if (it2.hasNext()) {
                view = it2.next();
                if (view instanceof StatefulLayout) {
                    break;
                }
            } else {
                view = null;
                break;
            }
        }
        View view2 = view;
        if (view2 == null) {
            return null;
        }
        return (StatefulLayout) view2;
    }

    protected int E() {
        return this.f22213x;
    }

    protected int G() {
        return this.f22214y;
    }

    protected int H() {
        return this.f22212j;
    }

    protected int I() {
        return this.f22211i;
    }

    public void J(ViewStates viewStates) {
        c.a.b(this, viewStates);
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        View root = m().getRoot();
        o.g(root, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) root;
        if (!(viewGroup2 instanceof StatefulLayout) && C(viewGroup2)) {
            throw new IllegalStateException("You must have " + StatefulLayout.class + " as your root view");
        }
        StatefulLayout D = D(viewGroup2);
        if (D == null) {
            D = (StatefulLayout) viewGroup2;
        }
        ((BaseStatefulViewModel) B()).v0().observe(getViewLifecycleOwner(), new a(D, this));
        return m().getRoot();
    }

    @Override // v9.c
    public void setStateViewsActions(View view) {
        c.a.c(this, view);
    }
}
