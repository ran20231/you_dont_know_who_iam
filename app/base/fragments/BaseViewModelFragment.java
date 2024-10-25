package com.forsale.app.base.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.c0;
import androidx.lifecycle.t;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.popUpsPrioritizer.PopUpType;
import com.forsale.app.utils.r0;
import com.forsale.app.utils.s0;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
import wz.p;
/* compiled from: BaseViewModelFragment.kt */
/* loaded from: classes2.dex */
public abstract class BaseViewModelFragment<B extends ViewDataBinding, VM extends BaseViewModel> extends com.forsale.app.base.fragments.a<B> {

    /* renamed from: g  reason: collision with root package name */
    private final boolean f22131g = true;

    /* renamed from: h  reason: collision with root package name */
    private ij.a f22132h;

    /* compiled from: BaseViewModelFragment.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0<Pair<? extends Integer, ? extends Pair<? extends g00.a<? extends p>, ? extends g00.a<? extends p>>>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseViewModelFragment<B, VM> f22133a;

        /* JADX WARN: Multi-variable type inference failed */
        a(BaseViewModelFragment<B, ? extends VM> baseViewModelFragment) {
            this.f22133a = baseViewModelFragment;
        }

        @Override // androidx.lifecycle.c0
        /* renamed from: a */
        public final void onChanged(Pair<Integer, ? extends Pair<? extends g00.a<p>, ? extends g00.a<p>>> pair) {
            Context context = this.f22133a.getContext();
            if (context != null) {
                String string = this.f22133a.getString(pair.c().intValue());
                o.h(string, "getString(...)");
                g00.a<p> c11 = pair.d().c();
                g00.a<p> d11 = pair.d().d();
                int i11 = y0.Z4;
                int i12 = y0.I4;
                if (ContextExtensionsKt.f(context)) {
                    c.a aVar = new c.a(context);
                    aVar.p("");
                    aVar.h(string);
                    aVar.m(context.getString(i11), new r0(c11));
                    aVar.j(context.getString(i12), new s0(d11));
                    aVar.d(false);
                    aVar.q();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        if (k()) {
            if (A()) {
                B().r0(new g00.a<p>(this) { // from class: com.forsale.app.base.fragments.BaseViewModelFragment$checkExpireSoonItems$1

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ BaseViewModelFragment<B, VM> f22134a;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                        this.f22134a = this;
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        MutableSharedFlow<p> a02 = this.f22134a.B().a0();
                        p pVar = p.f75480a;
                        a02.tryEmit(pVar);
                        this.f22134a.B().b0().tryEmit(pVar);
                    }
                });
            } else {
                MutableSharedFlow<p> a02 = B().a0();
                p pVar = p.f75480a;
                a02.tryEmit(pVar);
                B().b0().tryEmit(pVar);
            }
            B().I();
        }
    }

    private final ij.a y() {
        return new ij.a(PopUpType.EXPIRE_SOON, B().c0(), B().D());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(androidx.fragment.app.FragmentManager r6) {
        /*
            r5 = this;
            java.util.List r6 = r6.A0()
            if (r6 != 0) goto L7
            return
        L7:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r6 = r6.iterator()
        L12:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L46
            java.lang.Object r1 = r6.next()
            r2 = r1
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r3 = r2 instanceof androidx.fragment.app.j
            if (r3 == 0) goto L3f
            androidx.fragment.app.j r2 = (androidx.fragment.app.j) r2
            java.lang.String r3 = r2.getTag()
            java.lang.String r4 = "ExpireSoonBottomSheet"
            boolean r3 = kotlin.jvm.internal.o.d(r3, r4)
            if (r3 != 0) goto L3d
            java.lang.String r2 = r2.getTag()
            java.lang.String r3 = "ExpireSoonOptionsBottomSheet"
            boolean r2 = kotlin.jvm.internal.o.d(r2, r3)
            if (r2 == 0) goto L3f
        L3d:
            r2 = 1
            goto L40
        L3f:
            r2 = 0
        L40:
            if (r2 == 0) goto L12
            r0.add(r1)
            goto L12
        L46:
            java.util.Iterator r6 = r0.iterator()
        L4a:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L6d
            java.lang.Object r0 = r6.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            boolean r1 = r0 instanceof androidx.fragment.app.j
            if (r1 == 0) goto L60
            r1 = r0
            androidx.fragment.app.j r1 = (androidx.fragment.app.j) r1
            r1.dismissAllowingStateLoss()
        L60:
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.lang.String r1 = "getChildFragmentManager(...)"
            kotlin.jvm.internal.o.h(r0, r1)
            r5.z(r0)
            goto L4a
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.base.fragments.BaseViewModelFragment.z(androidx.fragment.app.FragmentManager):void");
    }

    protected boolean A() {
        return this.f22131g;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract VM B();

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        if (bundle != null) {
            B().s0(bundle);
        }
        super.onCreateView(inflater, viewGroup, bundle);
        m().X(90, B());
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$2(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$3(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$4(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$5(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$6(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$7(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$8(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$9(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$10(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$11(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$12(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$13(this, null));
        LifeCycleUtilsKt.b(this, new BaseViewModelFragment$onCreateView$14(this, null));
        B().C().observe(getViewLifecycleOwner(), new a(this));
        return m().getRoot();
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        o.h(childFragmentManager, "getChildFragmentManager(...)");
        z(childFragmentManager);
        super.onDestroyView();
        B().q0();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelFragment$onDestroyView$1(this, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        o.i(outState, "outState");
        super.onSaveInstanceState(outState);
        Bundle u02 = B().u0();
        if (u02 != null) {
            outState.putAll(u02);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        this.f22132h = y();
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new BaseViewModelFragment$onViewCreated$1(this, null), 3, null);
    }
}
