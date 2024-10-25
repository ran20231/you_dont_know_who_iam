package com.forsale.app.base.activities;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.core.view.ViewGroupKt;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.c0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import com.forsale.app.base.ViewStates;
import com.forsale.app.base.viewmodels.BaseStatefulViewModel;
import com.forsale.app.ui.StatefulLayout;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import v9.c;
import w3.a;
import wz.h;
/* compiled from: BaseStatefulActivity.kt */
/* loaded from: classes2.dex */
public abstract class BaseStatefulActivity<B extends ViewDataBinding, VM extends BaseStatefulViewModel> extends BaseViewModelActivity<B, VM> implements c {

    /* renamed from: e  reason: collision with root package name */
    private final h f22054e = new s0(s.b(BaseStatefulViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.base.activities.BaseStatefulActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            return ComponentActivity.this.getViewModelStore();
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.base.activities.BaseStatefulActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            return ComponentActivity.this.getDefaultViewModelProviderFactory();
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.base.activities.BaseStatefulActivity$special$$inlined$viewModels$default$3
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final a invoke() {
            a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (a) aVar2.invoke()) == null) {
                return this.getDefaultViewModelCreationExtras();
            }
            return aVar;
        }
    });

    /* renamed from: f  reason: collision with root package name */
    private final int f22055f = t9.t0.Y0;

    /* renamed from: g  reason: collision with root package name */
    private final int f22056g = t9.t0.V0;

    /* renamed from: h  reason: collision with root package name */
    private final int f22057h = t9.t0.S0;

    /* renamed from: i  reason: collision with root package name */
    private final int f22058i = t9.t0.T0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseStatefulActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements c0<ViewStates> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ StatefulLayout f22063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BaseStatefulActivity<B, VM> f22064b;

        /* compiled from: BaseStatefulActivity.kt */
        /* renamed from: com.forsale.app.base.activities.BaseStatefulActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C0248a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f22065a;

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
                f22065a = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(StatefulLayout statefulLayout, BaseStatefulActivity<? extends B, ? extends VM> baseStatefulActivity) {
            this.f22063a = statefulLayout;
            this.f22064b = baseStatefulActivity;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(ViewStates viewStates) {
            if (viewStates != null) {
                StatefulLayout statefulLayout = this.f22063a;
                BaseStatefulActivity<B, VM> baseStatefulActivity = this.f22064b;
                int i11 = C0248a.f22065a[viewStates.ordinal()];
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    statefulLayout.b(baseStatefulActivity.C0(), baseStatefulActivity);
                                }
                            } else {
                                statefulLayout.b(baseStatefulActivity.B0(), baseStatefulActivity);
                            }
                        } else {
                            statefulLayout.b(baseStatefulActivity.D0(), baseStatefulActivity);
                        }
                    } else {
                        statefulLayout.b(baseStatefulActivity.E0(), baseStatefulActivity);
                    }
                } else {
                    statefulLayout.d();
                }
                baseStatefulActivity.H0(viewStates);
            }
        }
    }

    private final StatefulLayout A0(ViewGroup viewGroup) {
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

    private final boolean z0(ViewGroup viewGroup) {
        for (View view : ViewGroupKt.a(viewGroup)) {
            if (view instanceof StatefulLayout) {
                return false;
            }
        }
        return true;
    }

    protected int B0() {
        return this.f22057h;
    }

    protected int C0() {
        return this.f22058i;
    }

    protected int D0() {
        return this.f22056g;
    }

    protected int E0() {
        return this.f22055f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: G0 */
    public BaseStatefulViewModel x0() {
        return (BaseStatefulViewModel) this.f22054e.getValue();
    }

    public void H0(ViewStates viewStates) {
        c.a.b(this, viewStates);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View root = o0().getRoot();
        o.g(root, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) root;
        if (!(viewGroup instanceof StatefulLayout) && z0(viewGroup)) {
            throw new IllegalStateException("You must have " + StatefulLayout.class + " as your root view or one at max as direct child");
        }
        StatefulLayout A0 = A0(viewGroup);
        if (A0 == null) {
            A0 = (StatefulLayout) viewGroup;
        }
        x0().v0().observe(this, new a(A0, this));
    }

    @Override // v9.c
    public void setStateViewsActions(View view) {
        c.a.c(this, view);
    }
}
