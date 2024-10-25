package com.forsale.app.ui.bottomsheets.postadsavelistingsuccess;

import aa.y3;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.features.postad.PostAdUtilsKt;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
import z3.i;
/* compiled from: PostAdSaveListingBottomSheet.kt */
/* loaded from: classes3.dex */
public final class PostAdSaveListingBottomSheet extends com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.a {

    /* renamed from: g  reason: collision with root package name */
    private final h f39003g = FragmentViewModelLazyKt.b(this, s.b(PostAdViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w0 invoke() {
            w0 viewModelStore = Fragment.this.requireActivity().getViewModelStore();
            o.h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$activityViewModels$default$2
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final w3.a invoke() {
            w3.a aVar;
            g00.a aVar2 = g00.a.this;
            if (aVar2 == null || (aVar = (w3.a) aVar2.invoke()) == null) {
                w3.a defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                o.h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
                return defaultViewModelCreationExtras;
            }
            return aVar;
        }
    }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // g00.a
        /* renamed from: b */
        public final t0.b invoke() {
            t0.b defaultViewModelProviderFactory = Fragment.this.requireActivity().getDefaultViewModelProviderFactory();
            o.h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    /* renamed from: h  reason: collision with root package name */
    private y3 f39004h;

    /* renamed from: i  reason: collision with root package name */
    private final h f39005i;

    /* renamed from: j  reason: collision with root package name */
    private final i f39006j;

    /* renamed from: x  reason: collision with root package name */
    private final h f39007x;

    /* compiled from: PostAdSaveListingBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            PostAdSaveListingBottomSheet.this.dismiss();
            PostAdUtilsKt.a(PostAdSaveListingBottomSheet.this);
            return p.f75480a;
        }
    }

    public PostAdSaveListingBottomSheet() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f39005i = FragmentViewModelLazyKt.b(this, s.b(PostAdSaveListingViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w3.a invoke() {
                x0 c11;
                l lVar;
                w3.a aVar2;
                g00.a aVar3 = g00.a.this;
                if (aVar3 == null || (aVar2 = (w3.a) aVar3.invoke()) == null) {
                    c11 = FragmentViewModelLazyKt.c(b11);
                    if (c11 instanceof l) {
                        lVar = (l) c11;
                    } else {
                        lVar = null;
                    }
                    if (lVar != null) {
                        return lVar.getDefaultViewModelCreationExtras();
                    }
                    return a.C0905a.f75031b;
                }
                return aVar2;
            }
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                x0 c11;
                l lVar;
                t0.b defaultViewModelProviderFactory;
                c11 = FragmentViewModelLazyKt.c(b11);
                if (c11 instanceof l) {
                    lVar = (l) c11;
                } else {
                    lVar = null;
                }
                if (lVar == null || (defaultViewModelProviderFactory = lVar.getDefaultViewModelProviderFactory()) == null) {
                    t0.b defaultViewModelProviderFactory2 = Fragment.this.getDefaultViewModelProviderFactory();
                    o.h(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory2;
                }
                return defaultViewModelProviderFactory;
            }
        });
        this.f39006j = new i(s.b(b.class), new g00.a<Bundle>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$special$$inlined$navArgs$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Bundle invoke() {
                Bundle arguments = Fragment.this.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " has null arguments");
            }
        });
        a11 = kotlin.d.a(new g00.a<Boolean>() { // from class: com.forsale.app.ui.bottomsheets.postadsavelistingsuccess.PostAdSaveListingBottomSheet$showIfNoCoins$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // g00.a
            public final Boolean invoke() {
                b x11;
                x11 = PostAdSaveListingBottomSheet.this.x();
                return Boolean.valueOf(x11.a());
            }
        });
        this.f39007x = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b x() {
        return (b) this.f39006j.getValue();
    }

    private final boolean y() {
        return ((Boolean) this.f39007x.getValue()).booleanValue();
    }

    private final PostAdSaveListingViewModel z() {
        return (PostAdSaveListingViewModel) this.f39005i.getValue();
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70793c;
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        y3 f02 = y3.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39004h = f02;
        y3 y3Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        f02.i0(z());
        y3 y3Var2 = this.f39004h;
        if (y3Var2 == null) {
            o.w("binding");
            y3Var2 = null;
        }
        y3Var2.h0(Boolean.valueOf(y()));
        y3 y3Var3 = this.f39004h;
        if (y3Var3 == null) {
            o.w("binding");
        } else {
            y3Var = y3Var3;
        }
        return y3Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<p> e11 = z().e();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        e11.h(viewLifecycleOwner, new a());
    }
}
