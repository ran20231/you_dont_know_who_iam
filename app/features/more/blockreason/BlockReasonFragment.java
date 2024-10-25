package com.forsale.app.features.more.blockreason;

import aa.m7;
import android.content.Context;
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
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.features.more.support.SupportActivity;
import com.forsale.app.utils.OneShotEventHandler;
import g00.a;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import pd.d;
import t9.y0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: BlockReasonFragment.kt */
/* loaded from: classes2.dex */
public final class BlockReasonFragment extends d<m7, BlockReasonViewModel> {
    private final h A;
    private final int B;

    /* compiled from: BlockReasonFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            Context context = BlockReasonFragment.this.getContext();
            if (context != null) {
                WebActivity.a aVar2 = WebActivity.I;
                WebType webType = WebType.TERMS_CONDITIONS;
                String string = BlockReasonFragment.this.getString(y0.f70455fa);
                o.h(string, "getString(...)");
                WebActivity.a.d(aVar2, context, webType, string, null, 0, null, 24, null);
            }
            return p.f75480a;
        }
    }

    /* compiled from: BlockReasonFragment.kt */
    /* loaded from: classes2.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            Context context = BlockReasonFragment.this.getContext();
            if (context != null) {
                SupportActivity.f32788x.a(context);
            }
            return p.f75480a;
        }
    }

    public BlockReasonFragment() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.blockreason.BlockReasonFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.blockreason.BlockReasonFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) a.this.invoke();
            }
        });
        this.A = FragmentViewModelLazyKt.b(this, s.b(BlockReasonViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.blockreason.BlockReasonFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.blockreason.BlockReasonFragment$special$$inlined$viewModels$default$4
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
                a aVar3 = a.this;
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.blockreason.BlockReasonFragment$special$$inlined$viewModels$default$5
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
        this.B = t9.t0.f70310u1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: H */
    public BlockReasonViewModel B() {
        return (BlockReasonViewModel) this.A.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.B;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            B().C0();
            p pVar = p.f75480a;
        }
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        View onCreateView = super.onCreateView(inflater, viewGroup, bundle);
        BlockReasonViewModel B = B();
        OneShotEventHandler<p> B0 = B.B0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        B0.h(viewLifecycleOwner, new a());
        OneShotEventHandler<p> A0 = B.A0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        A0.h(viewLifecycleOwner2, new b());
        return onCreateView;
    }
}
