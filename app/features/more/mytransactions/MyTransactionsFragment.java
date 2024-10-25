package com.forsale.app.features.more.mytransactions;

import aa.e8;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import com.forsale.app.base.ActionViewsMode;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.designSystem.buttons.ButtonData;
import com.forsale.designSystem.buttons.ButtonsKt;
import com.forsale.designSystem.notificationsystem.InlineAlertKt;
import com.forsale.designSystem.notificationsystem.InlineAlertState;
import com.forsale.designSystem.theme.ThemeKt;
import g00.p;
import j0.d1;
import j0.v0;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.q0;
import w3.a;
import wz.h;
/* compiled from: MyTransactionsFragment.kt */
/* loaded from: classes2.dex */
public final class MyTransactionsFragment extends ud.a<e8, MyTransactionsViewModel> {
    private final h E;
    private final int F;
    private final int G;
    private final h H;

    public MyTransactionsFragment() {
        final h b11;
        h a11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.E = FragmentViewModelLazyKt.b(this, s.b(MyTransactionsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$special$$inlined$viewModels$default$5
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
        this.F = t9.t0.D1;
        this.G = t9.t0.P5;
        a11 = d.a(new g00.a<ud.d>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$transactionAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ud.d invoke() {
                return new ud.d(MyTransactionsFragment.this.B());
            }
        });
        this.H = a11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(640601204);
        if (c.I()) {
            c.U(640601204, i11, -1, "com.forsale.app.features.more.mytransactions.MyTransactionsFragment.MyTransactionUpdateAlert (MyTransactionsFragment.kt:75)");
        }
        InlineAlertState.b bVar = new InlineAlertState.b(null, 1, null);
        ComposableSingletons$MyTransactionsFragmentKt composableSingletons$MyTransactionsFragmentKt = ComposableSingletons$MyTransactionsFragmentKt.f31957a;
        InlineAlertKt.a(null, bVar, composableSingletons$MyTransactionsFragmentKt.a(), null, composableSingletons$MyTransactionsFragmentKt.b(), r0.b.b(h11, 812464679, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$MyTransactionUpdateAlert$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar2, int i12) {
                if ((i12 & 11) == 2 && aVar2.i()) {
                    aVar2.L();
                    return;
                }
                if (c.I()) {
                    c.U(812464679, i12, -1, "com.forsale.app.features.more.mytransactions.MyTransactionsFragment.MyTransactionUpdateAlert.<anonymous> (MyTransactionsFragment.kt:79)");
                }
                ButtonData c11 = ButtonData.f40994a.c();
                w.o a11 = PaddingKt.a(e2.h.l(0));
                final MyTransactionsFragment myTransactionsFragment = MyTransactionsFragment.this;
                ButtonsKt.l(new g00.a<wz.p>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$MyTransactionUpdateAlert$1.1
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Context requireContext = MyTransactionsFragment.this.requireContext();
                        o.h(requireContext, "requireContext(...)");
                        ContextExtensionsKt.G(requireContext);
                    }
                }, null, c11, false, a11, null, null, null, null, null, ComposableSingletons$MyTransactionsFragmentKt.f31957a.c(), aVar2, (ButtonData.f40995b << 6) | 24576, 6, 1002);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                b(aVar2, num.intValue());
                return wz.p.f75480a;
            }
        }), null, null, h11, (InlineAlertState.b.f41957c << 3) | 221568, 201);
        if (c.I()) {
            c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$MyTransactionUpdateAlert$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    MyTransactionsFragment.this.Q(aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return wz.p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ud.d V() {
        return (ud.d) this.H.getValue();
    }

    private final void Y() {
        b0();
        a0();
    }

    private final void a0() {
        B().C0();
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new MyTransactionsFragment$loadData$1(this, null), 3, null);
    }

    private final void b0() {
        ((e8) m()).P.setContent(r0.b.c(2126463614, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$setupRecycleView$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(2);
            }

            public final void b(androidx.compose.runtime.a aVar, int i11) {
                if ((i11 & 11) == 2 && aVar.i()) {
                    aVar.L();
                    return;
                }
                if (c.I()) {
                    c.U(2126463614, i11, -1, "com.forsale.app.features.more.mytransactions.MyTransactionsFragment.setupRecycleView.<anonymous> (MyTransactionsFragment.kt:56)");
                }
                final MyTransactionsFragment myTransactionsFragment = MyTransactionsFragment.this;
                ThemeKt.a(null, null, r0.b.b(aVar, 1197983829, true, new p<androidx.compose.runtime.a, Integer, wz.p>() { // from class: com.forsale.app.features.more.mytransactions.MyTransactionsFragment$setupRecycleView$1.1
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        if ((i12 & 11) == 2 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (c.I()) {
                            c.U(1197983829, i12, -1, "com.forsale.app.features.more.mytransactions.MyTransactionsFragment.setupRecycleView.<anonymous>.<anonymous> (MyTransactionsFragment.kt:57)");
                        }
                        MyTransactionsFragment.this.Q(aVar2, 8);
                        if (c.I()) {
                            c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return wz.p.f75480a;
                    }
                }), aVar, 384, 3);
                if (c.I()) {
                    c.T();
                }
            }

            @Override // g00.p
            public /* bridge */ /* synthetic */ wz.p invoke(androidx.compose.runtime.a aVar, Integer num) {
                b(aVar, num.intValue());
                return wz.p.f75480a;
            }
        }));
        RecyclerView recyclerView = ((e8) m()).O;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            i iVar = new i(context, 1);
            Drawable drawable = androidx.core.content.b.getDrawable(context, q0.M);
            if (drawable != null) {
                iVar.f(drawable);
            }
            recyclerView.setAdapter(V());
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
            recyclerView.j(iVar);
        }
    }

    @Override // com.forsale.app.base.fragments.b
    protected int G() {
        return this.G;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.fragments.BaseViewModelFragment
    /* renamed from: X */
    public MyTransactionsViewModel B() {
        return (MyTransactionsViewModel) this.E.getValue();
    }

    @Override // com.forsale.app.base.fragments.a
    protected int o() {
        return this.F;
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((e8) m()).O.setAdapter(null);
        super.onDestroyView();
    }

    @v9.a(viewId = {ActionViewsMode.ERROR_RELOAD, ActionViewsMode.ERROR_REFRESH, ActionViewsMode.MAINTENANCE_RELOAD})
    public final void onError(View view) {
        o.i(view, "view");
        a0();
    }

    @Override // com.forsale.app.base.fragments.BaseViewModelFragment, com.forsale.app.base.fragments.a, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        Y();
    }
}
