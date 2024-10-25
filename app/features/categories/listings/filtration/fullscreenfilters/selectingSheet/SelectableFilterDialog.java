package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import androidx.compose.ui.c;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.input.v;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import c0.f;
import c0.g;
import com.forsale.app.features.categories.listings.filtration.full.filterModels.ParentGroupModel;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.filterModels.FilterScreenTypes;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterViewModel;
import com.forsale.app.features.categories.listings.filtration.views.SheetsViewKt;
import com.forsale.app.utils.LifeCycleUtilsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.app.utils.analytics.listingfiltration.FilterPlaces;
import com.forsale.designSystem.TextKt;
import com.forsale.designSystem.inputs.InputsKt;
import com.forsale.designSystem.layouts.ListItemsKt;
import com.forsale.designSystem.theme.ThemeKt;
import fc.c;
import g00.l;
import g00.q;
import j0.d1;
import j0.e;
import j0.e1;
import j0.k;
import j0.n1;
import j0.v0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.r;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.y0;
import t9.z0;
import v.j;
import w.u;
import wz.h;
import wz.p;
/* compiled from: SelectableFilterDialog.kt */
/* loaded from: classes2.dex */
public final class SelectableFilterDialog extends com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.a {

    /* renamed from: j  reason: collision with root package name */
    public static final a f29953j = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f29954x = 8;

    /* renamed from: f  reason: collision with root package name */
    private l<? super c, p> f29955f;

    /* renamed from: g  reason: collision with root package name */
    private a.AbstractC0319a.b f29956g;

    /* renamed from: h  reason: collision with root package name */
    public SelectableFilterViewModel.b f29957h;

    /* renamed from: i  reason: collision with root package name */
    private final h f29958i;

    /* compiled from: SelectableFilterDialog.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(FragmentManager fragmentManager, a.AbstractC0319a.b filterCapsule, l<? super c, p> onActionDone) {
            o.i(fragmentManager, "fragmentManager");
            o.i(filterCapsule, "filterCapsule");
            o.i(onActionDone, "onActionDone");
            SelectableFilterDialog selectableFilterDialog = new SelectableFilterDialog();
            selectableFilterDialog.f29956g = filterCapsule;
            selectableFilterDialog.f29955f = onActionDone;
            selectableFilterDialog.show(fragmentManager, "SelectableFullScreenFilterDialogFragment");
        }
    }

    public SelectableFilterDialog() {
        h b11;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes2.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ SelectableFilterDialog f29971f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, SelectableFilterDialog selectableFilterDialog) {
                    super(fragment, bundle);
                    this.f29971f = selectableFilterDialog;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    a.AbstractC0319a.b bVar;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    SelectableFilterViewModel.b S = this.f29971f.S();
                    bVar = this.f29971f.f29956g;
                    o.f(bVar);
                    SelectableFilterViewModel a11 = S.a(bVar);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f29958i = FragmentViewModelLazyKt.b(this, s.b(SelectableFilterViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    private static final boolean A(n1<Boolean> n1Var) {
        return n1Var.getValue().booleanValue();
    }

    private static final boolean B(j0.k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean C(j0.k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    private final boolean Q(dc.c cVar, String str) {
        return T().b1(cVar, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SelectableFilterViewModel T() {
        return (SelectableFilterViewModel) this.f29958i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(final String str, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1389509094);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1389509094, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.GroupedList (SelectableFilterDialog.kt:190)");
        }
        final j0.k0<LinkedHashMap<ParentGroupModel, List<dc.c>>> D0 = T().D0();
        androidx.compose.ui.c b11 = BackgroundKt.b(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), dk.a.f54291a.a(h11, dk.a.f54292b).e().h(h11, yj.d.f76453b), null, 2, null);
        h11.C(733328855);
        a0 g11 = BoxKt.g(v0.b.f74009a.o(), false, h11, 0);
        h11.C(-1323940314);
        int a11 = e.a(h11, 0);
        k s11 = h11.s();
        ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
        g00.a<ComposeUiNode> a12 = companion.a();
        q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
        if (!(h11.k() instanceof j0.d)) {
            e.c();
        }
        h11.I();
        if (h11.f()) {
            h11.y(a12);
        } else {
            h11.t();
        }
        androidx.compose.runtime.a a13 = Updater.a(h11);
        Updater.c(a13, g11, companion.e());
        Updater.c(a13, s11, companion.g());
        g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
        if (a13.f() || !o.d(a13.D(), Integer.valueOf(a11))) {
            a13.u(Integer.valueOf(a11));
            a13.p(Integer.valueOf(a11), b12);
        }
        c11.invoke(e1.a(e1.b(h11)), h11, 0);
        h11.C(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.f3756a;
        LazyDslKt.a(null, null, PaddingKt.a(e2.h.l(16)), false, Arrangement.f3698a.o(e2.h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$GroupedList$1$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LazyListScope LazyColumn) {
                LinkedHashMap s12;
                o.i(LazyColumn, "$this$LazyColumn");
                if (SelectableFilterDialog.this.T().W0(str)) {
                    s12 = SelectableFilterDialog.s(D0);
                    SelectableFilterDialog selectableFilterDialog = SelectableFilterDialog.this;
                    String str2 = str;
                    for (Map.Entry entry : s12.entrySet()) {
                        selectableFilterDialog.y(LazyColumn, (List) entry.getValue(), ((ParentGroupModel) entry.getKey()).b(), str2);
                    }
                    return;
                }
                LazyListScope.l(LazyColumn, null, null, ComposableSingletons$SelectableFilterDialogKt.f29948a.b(), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                b(lazyListScope);
                return p.f75480a;
            }
        }, h11, 24960, 235);
        h11.S();
        h11.w();
        h11.S();
        h11.S();
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.T();
        }
        d1 l11 = h11.l();
        if (l11 != null) {
            l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$GroupedList$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    SelectableFilterDialog.this.r(str, aVar2, v0.a(i11 | 1));
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LinkedHashMap<ParentGroupModel, List<dc.c>> s(j0.k0<LinkedHashMap<ParentGroupModel, List<dc.c>>> k0Var) {
        return k0Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(j0.k0<Boolean> k0Var) {
        return k0Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(final String str, androidx.compose.runtime.a aVar, final int i11) {
        androidx.compose.runtime.a h11 = aVar.h(1352238945);
        if (androidx.compose.runtime.c.I()) {
            androidx.compose.runtime.c.U(1352238945, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.NormalList (SelectableFilterDialog.kt:169)");
        }
        SnapshotStateList<dc.c> H0 = T().H0();
        final ArrayList arrayList = new ArrayList();
        for (dc.c cVar : H0) {
            if (Q(cVar, str)) {
                arrayList.add(cVar);
            }
        }
        LazyDslKt.a(null, null, PaddingKt.a(e2.h.l(16)), false, Arrangement.f3698a.o(e2.h.l(12)), null, null, false, new l<LazyListScope, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(LazyListScope LazyColumn) {
                o.i(LazyColumn, "$this$LazyColumn");
                if (!arrayList.isEmpty()) {
                    final List<dc.c> list = arrayList;
                    final SelectableFilterDialog selectableFilterDialog = this;
                    final SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1 selectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1 = SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1.f29959a;
                    LazyColumn.f(list.size(), null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002d: INVOKE  
                          (r13v0 'LazyColumn' androidx.compose.foundation.lazy.LazyListScope)
                          (wrap: int : 0x0017: INVOKE  (r4v0 int A[REMOVE]) = (r0v6 'list' java.util.List<dc.c>) type: INTERFACE call: java.util.List.size():int)
                          (null g00.l<? super java.lang.Integer, ? extends java.lang.Object>)
                          (wrap: g00.l<java.lang.Integer, java.lang.Object> : 0x001d: CONSTRUCTOR  (r5v0 g00.l<java.lang.Integer, java.lang.Object> A[REMOVE]) = 
                          (r3v0 'selectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1 A[DONT_INLINE])
                          (r0v6 'list' java.util.List<dc.c> A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$3.<init>(g00.l, java.util.List):void type: CONSTRUCTOR)
                          (wrap: r0.a : 0x0028: INVOKE  (r0v8 r0.a A[REMOVE]) = 
                          (-632812321 int)
                          true
                          (wrap: g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x0022: CONSTRUCTOR  (r3v1 g00.r<x.a, java.lang.Integer, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r0v6 'list' java.util.List<dc.c> A[DONT_INLINE])
                          (r2v0 'selectableFilterDialog' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$4.<init>(java.util.List, com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.c(int, boolean, java.lang.Object):r0.a)
                         type: INTERFACE call: androidx.compose.foundation.lazy.LazyListScope.f(int, g00.l, g00.l, g00.r):void in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1.b(androidx.compose.foundation.lazy.LazyListScope):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$3, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 23 more
                        */
                    /*
                        this = this;
                        java.lang.String r0 = "$this$LazyColumn"
                        kotlin.jvm.internal.o.i(r13, r0)
                        java.util.List<dc.c> r0 = r1
                        java.util.Collection r0 = (java.util.Collection) r0
                        boolean r0 = r0.isEmpty()
                        r1 = 1
                        r0 = r0 ^ r1
                        if (r0 == 0) goto L31
                        java.util.List<dc.c> r0 = r1
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog r2 = r2
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1 r3 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$1.f29959a
                        int r4 = r0.size()
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$3 r5 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$3
                        r5.<init>(r3, r0)
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$4 r3 = new com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1$invoke$$inlined$items$default$4
                        r3.<init>(r0, r2)
                        r0 = -632812321(0xffffffffda480cdf, float:-1.40772868E16)
                        r0.a r0 = r0.b.c(r0, r1, r3)
                        r1 = 0
                        r13.f(r4, r1, r5, r0)
                        goto L3f
                    L31:
                        r7 = 0
                        r8 = 0
                        com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt r0 = com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.ComposableSingletons$SelectableFilterDialogKt.f29948a
                        g00.q r9 = r0.a()
                        r10 = 3
                        r11 = 0
                        r6 = r13
                        androidx.compose.foundation.lazy.LazyListScope.l(r6, r7, r8, r9, r10, r11)
                    L3f:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$1.b(androidx.compose.foundation.lazy.LazyListScope):void");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(LazyListScope lazyListScope) {
                    b(lazyListScope);
                    return p.f75480a;
                }
            }, h11, 24960, 235);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$NormalList$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        SelectableFilterDialog.this.x(str, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final SelectableFilterViewModel.b S() {
            SelectableFilterViewModel.b bVar = this.f29957h;
            if (bVar != null) {
                return bVar;
            }
            o.w("factory");
            return null;
        }

        @Override // androidx.fragment.app.j
        public int getTheme() {
            return z0.f70797g;
        }

        @Override // androidx.fragment.app.Fragment
        public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
            o.i(inflater, "inflater");
            Context requireContext = requireContext();
            o.h(requireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
            composeView.setContent(r0.b.c(-1189476043, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$onCreateView$1$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar, int i11) {
                    if ((i11 & 11) == 2 && aVar.i()) {
                        aVar.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-1189476043, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.onCreateView.<anonymous>.<anonymous> (SelectableFilterDialog.kt:76)");
                    }
                    final SelectableFilterDialog selectableFilterDialog = SelectableFilterDialog.this;
                    ThemeKt.a(null, null, r0.b.b(aVar, 1085082700, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$onCreateView$1$1.1
                        {
                            super(2);
                        }

                        public final void b(androidx.compose.runtime.a aVar2, int i12) {
                            if ((i12 & 11) == 2 && aVar2.i()) {
                                aVar2.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1085082700, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.onCreateView.<anonymous>.<anonymous>.<anonymous> (SelectableFilterDialog.kt:77)");
                            }
                            SelectableFilterDialog.this.z(aVar2, 8);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.p
                        public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), aVar, 384, 3);
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar, Integer num) {
                    b(aVar, num.intValue());
                    return p.f75480a;
                }
            }));
            return composeView;
        }

        @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialog) {
            l<? super c, p> lVar;
            List n11;
            o.i(dialog, "dialog");
            if (this.f29956g != null && T().J0().getValue().booleanValue() && (lVar = this.f29955f) != null) {
                n11 = r.n();
                lVar.invoke(new c.a(n11, null, 2, null));
            }
            super.onDismiss(dialog);
        }

        @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
        public void onStart() {
            Window window;
            FilterPlaces filterPlaces;
            fc.a a11;
            FilterScreenTypes.NewScreen d11;
            super.onStart();
            Dialog dialog = getDialog();
            if (dialog != null && (window = dialog.getWindow()) != null) {
                a.AbstractC0319a.b bVar = this.f29956g;
                if (bVar != null && (a11 = bVar.a()) != null && (d11 = a11.d()) != null) {
                    filterPlaces = d11.c();
                } else {
                    filterPlaces = null;
                }
                if (filterPlaces == FilterPlaces.ALL_FILTERS) {
                    window.setWindowAnimations(z0.f70796f);
                } else {
                    window.setWindowAnimations(z0.f70795e);
                }
            }
        }

        @Override // androidx.fragment.app.Fragment
        public void onViewCreated(View view, Bundle bundle) {
            o.i(view, "view");
            super.onViewCreated(view, bundle);
            if (this.f29956g == null) {
                dismiss();
            } else {
                LifeCycleUtilsKt.b(this, new SelectableFilterDialog$onViewCreated$1(this, null));
            }
        }

        public final void q(final String label, androidx.compose.runtime.a aVar, final int i11) {
            int i12;
            androidx.compose.runtime.a aVar2;
            int i13;
            o.i(label, "label");
            androidx.compose.runtime.a h11 = aVar.h(-1046087914);
            if ((i11 & 14) == 0) {
                if (h11.T(label)) {
                    i13 = 4;
                } else {
                    i13 = 2;
                }
                i12 = i13 | i11;
            } else {
                i12 = i11;
            }
            if ((i12 & 11) == 2 && h11.i()) {
                h11.L();
                aVar2 = h11;
            } else {
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.U(-1046087914, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.GroupHeader (SelectableFilterDialog.kt:242)");
                }
                dk.a aVar3 = dk.a.f54291a;
                int i14 = dk.a.f54292b;
                aVar2 = h11;
                TextKt.a(label, null, 0, 0, false, 0, 0, null, aVar3.c(h11, i14).r(), aVar3.a(h11, i14).e().j(h11, yj.d.f76453b), 0, h11, i12 & 14, 0, 1278);
                if (androidx.compose.runtime.c.I()) {
                    androidx.compose.runtime.c.T();
                }
            }
            d1 l11 = aVar2.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$GroupHeader$1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar4, int i15) {
                        SelectableFilterDialog.this.q(label, aVar4, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar4, Integer num) {
                        b(aVar4, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void t(final dc.c option, androidx.compose.runtime.a aVar, final int i11) {
            o.i(option, "option");
            androidx.compose.runtime.a h11 = aVar.h(424717405);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(424717405, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.MultiSelectOptions (SelectableFilterDialog.kt:253)");
            }
            final j0.k0<Boolean> l11 = option.l();
            h11.C(-492369756);
            Object D = h11.D();
            if (D == androidx.compose.runtime.a.f7182a.a()) {
                D = j.a();
                h11.u(D);
            }
            h11.S();
            final v.k kVar = (v.k) D;
            f c11 = g.c(e2.h.l(8));
            float l12 = e2.h.l(0);
            androidx.compose.material.e.b(new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$1
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SelectableFilterDialog.this.T().V0(option);
                }
            }, null, false, c11, 0L, 0L, s.g.a(e2.h.l(1), dk.a.f54291a.a(h11, dk.a.f54292b).e().d(h11, yj.d.f76453b)), l12, null, r0.b.b(h11, -2076590409, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void b(androidx.compose.runtime.a aVar2, int i12) {
                    if ((i12 & 11) == 2 && aVar2.i()) {
                        aVar2.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(-2076590409, i12, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.MultiSelectOptions.<anonymous> (SelectableFilterDialog.kt:263)");
                    }
                    c.a aVar3 = androidx.compose.ui.c.f7566a;
                    androidx.compose.ui.c i13 = PaddingKt.i(aVar3, e2.h.l(12));
                    v.k kVar2 = v.k.this;
                    final SelectableFilterDialog selectableFilterDialog = this;
                    final dc.c cVar = option;
                    final j0.k0<Boolean> k0Var = l11;
                    aVar2.C(693286680);
                    a0 a11 = androidx.compose.foundation.layout.o.a(Arrangement.f3698a.g(), v0.b.f74009a.l(), aVar2, 0);
                    aVar2.C(-1323940314);
                    int a12 = e.a(aVar2, 0);
                    k s11 = aVar2.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a13 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c12 = LayoutKt.c(i13);
                    if (!(aVar2.k() instanceof j0.d)) {
                        e.c();
                    }
                    aVar2.I();
                    if (aVar2.f()) {
                        aVar2.y(a13);
                    } else {
                        aVar2.t();
                    }
                    androidx.compose.runtime.a a14 = Updater.a(aVar2);
                    Updater.c(a14, a11, companion.e());
                    Updater.c(a14, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b11 = companion.b();
                    if (a14.f() || !o.d(a14.D(), Integer.valueOf(a12))) {
                        a14.u(Integer.valueOf(a12));
                        a14.p(Integer.valueOf(a12), b11);
                    }
                    c12.invoke(e1.a(e1.b(aVar2)), aVar2, 0);
                    aVar2.C(2058660585);
                    u uVar = u.f74924a;
                    ListItemsKt.b(ClickableKt.c(aVar3, kVar2, null, false, null, null, 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0108: INVOKE  
                          (wrap: androidx.compose.ui.c : 0x00e1: INVOKE  (r1v8 androidx.compose.ui.c A[REMOVE]) = 
                          (r9v0 'aVar3' androidx.compose.ui.c$a)
                          (r10v0 'kVar2' v.k)
                          (null s.n)
                          false
                          (null java.lang.String)
                          (null q1.i)
                          (wrap: g00.a<wz.p> : 0x00da: CONSTRUCTOR  (r15v0 g00.a<wz.p> A[REMOVE]) = 
                          (r2v2 'selectableFilterDialog' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog A[DONT_INLINE])
                          (r3v1 'cVar' dc.c A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2$1$1.<init>(com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog, dc.c):void type: CONSTRUCTOR)
                          (28 int)
                          (null java.lang.Object)
                         type: STATIC call: androidx.compose.foundation.ClickableKt.c(androidx.compose.ui.c, v.k, s.n, boolean, java.lang.String, q1.i, g00.a, int, java.lang.Object):androidx.compose.ui.c)
                          (null g00.p)
                          (wrap: r0.a : 0x00ef: INVOKE  (r6v7 r0.a A[REMOVE]) = 
                          (r19v0 'aVar2' androidx.compose.runtime.a)
                          (1580028879 int)
                          true
                          (wrap: g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x00e8: CONSTRUCTOR  (r6v6 g00.q<w.t, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = (r3v1 'cVar' dc.c A[DONT_INLINE]) call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2$1$2.<init>(dc.c):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                          (wrap: r0.a : 0x00fb: INVOKE  (r4v1 r0.a A[REMOVE]) = 
                          (r19v0 'aVar2' androidx.compose.runtime.a)
                          (29391903 int)
                          true
                          (wrap: g00.q<w.c, androidx.compose.runtime.a, java.lang.Integer, wz.p> : 0x00f5: CONSTRUCTOR  (r7v2 g00.q<w.c, androidx.compose.runtime.a, java.lang.Integer, wz.p> A[REMOVE]) = 
                          (r2v2 'selectableFilterDialog' com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog A[DONT_INLINE])
                          (r4v0 'k0Var' j0.k0<java.lang.Boolean> A[DONT_INLINE])
                          (r3v1 'cVar' dc.c A[DONT_INLINE])
                         call: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2$1$3.<init>(com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog, j0.k0, dc.c):void type: CONSTRUCTOR)
                         type: STATIC call: r0.b.b(androidx.compose.runtime.a, int, boolean, java.lang.Object):r0.a)
                          (r19v0 'aVar2' androidx.compose.runtime.a)
                          (3456 int)
                          (2 int)
                         type: STATIC call: com.forsale.designSystem.layouts.ListItemsKt.b(androidx.compose.ui.c, g00.p, g00.q, g00.q, androidx.compose.runtime.a, int, int):void in method: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2.b(androidx.compose.runtime.a, int):void, file: classes2.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2$1$1, state: NOT_LOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:769)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:718)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:417)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:144)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:120)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1097)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:872)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:421)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
                        	... 19 more
                        */
                    /*
                        Method dump skipped, instructions count: 289
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$2.b(androidx.compose.runtime.a, int):void");
                }

                @Override // g00.p
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                    b(aVar2, num.intValue());
                    return p.f75480a;
                }
            }), h11, 817889280, 310);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l13 = h11.l();
            if (l13 != null) {
                l13.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$MultiSelectOptions$3
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar2, int i12) {
                        SelectableFilterDialog.this.t(option, aVar2, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar2, Integer num) {
                        b(aVar2, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }

        public final void y(LazyListScope lazyListScope, List<dc.c> groupList, final String groupHeader, String searchedText) {
            boolean v11;
            boolean v12;
            o.i(lazyListScope, "<this>");
            o.i(groupList, "groupList");
            o.i(groupHeader, "groupHeader");
            o.i(searchedText, "searchedText");
            final ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = groupList.iterator();
            while (true) {
                boolean z11 = true;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                dc.c cVar = (dc.c) next;
                v12 = kotlin.text.s.v(searchedText);
                if (!v12) {
                    z11 = Q(cVar, searchedText);
                }
                if (z11) {
                    arrayList.add(next);
                }
            }
            if (!arrayList.isEmpty()) {
                v11 = kotlin.text.s.v(groupHeader);
                if (!v11) {
                    LazyListScope.l(lazyListScope, null, null, r0.b.c(1443928216, true, new q<x.a, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$OptionsSections$1
                        /* JADX INFO: Access modifiers changed from: package-private */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        public final void b(x.a item, androidx.compose.runtime.a aVar, int i11) {
                            o.i(item, "$this$item");
                            if ((i11 & 81) == 16 && aVar.i()) {
                                aVar.L();
                                return;
                            }
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.U(1443928216, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.OptionsSections.<anonymous> (SelectableFilterDialog.kt:229)");
                            }
                            SelectableFilterDialog.this.q(groupHeader, aVar, 64);
                            if (androidx.compose.runtime.c.I()) {
                                androidx.compose.runtime.c.T();
                            }
                        }

                        @Override // g00.q
                        public /* bridge */ /* synthetic */ p invoke(x.a aVar, androidx.compose.runtime.a aVar2, Integer num) {
                            b(aVar, aVar2, num.intValue());
                            return p.f75480a;
                        }
                    }), 3, null);
                }
                final SelectableFilterDialog$OptionsSections$$inlined$items$default$1 selectableFilterDialog$OptionsSections$$inlined$items$default$1 = new l() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$OptionsSections$$inlined$items$default$1
                    @Override // g00.l
                    /* renamed from: b */
                    public final Void invoke(dc.c cVar2) {
                        return null;
                    }
                };
                lazyListScope.f(arrayList.size(), null, new l<Integer, Object>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$OptionsSections$$inlined$items$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final Object b(int i11) {
                        return l.this.invoke(arrayList.get(i11));
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return b(num.intValue());
                    }
                }, r0.b.c(-632812321, true, new g00.r<x.a, Integer, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$OptionsSections$$inlined$items$default$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(4);
                    }

                    public final void b(x.a aVar, int i11, androidx.compose.runtime.a aVar2, int i12) {
                        int i13;
                        int i14;
                        int i15;
                        if ((i12 & 14) == 0) {
                            if (aVar2.T(aVar)) {
                                i15 = 4;
                            } else {
                                i15 = 2;
                            }
                            i13 = i15 | i12;
                        } else {
                            i13 = i12;
                        }
                        if ((i12 & 112) == 0) {
                            if (aVar2.d(i11)) {
                                i14 = 32;
                            } else {
                                i14 = 16;
                            }
                            i13 |= i14;
                        }
                        if ((i13 & 731) == 146 && aVar2.i()) {
                            aVar2.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:148)");
                        }
                        this.t((dc.c) arrayList.get(i11), aVar2, 72);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.r
                    public /* bridge */ /* synthetic */ p d(x.a aVar, Integer num, androidx.compose.runtime.a aVar2, Integer num2) {
                        b(aVar, num.intValue(), aVar2, num2.intValue());
                        return p.f75480a;
                    }
                }));
            }
        }

        public final void z(androidx.compose.runtime.a aVar, final int i11) {
            int i12;
            androidx.compose.runtime.a h11 = aVar.h(646486185);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.U(646486185, i11, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.SelectableOptions (SelectableFilterDialog.kt:120)");
            }
            n1 a11 = z.a(T().K0(), Boolean.FALSE, null, h11, 56, 2);
            final z0.d dVar = (z0.d) h11.q(CompositionLocalsKt.f());
            j0.k0<Boolean> E0 = T().E0();
            if (T().C0().a().d().c() == FilterPlaces.ALL_FILTERS) {
                i12 = sj.d.f68672i;
            } else {
                i12 = sj.d.f68681r;
            }
            h11.C(-492369756);
            Object D = h11.D();
            a.C0064a c0064a = androidx.compose.runtime.a.f7182a;
            r0.a aVar2 = null;
            if (D == c0064a.a()) {
                D = c0.e("", null, 2, null);
                h11.u(D);
            }
            h11.S();
            final j0.k0 k0Var = (j0.k0) D;
            final j0.k0<Boolean> S0 = T().S0();
            h11.C(-492369756);
            String D2 = h11.D();
            if (D2 == c0064a.a()) {
                D2 = T().I0().getValue();
                h11.u(D2);
            }
            h11.S();
            final String str = (String) D2;
            String a12 = T().C0().a().a();
            boolean A = A(a11);
            g00.a<p> aVar3 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$1
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SelectableFilterDialog.this.T().Z0();
                }
            };
            g00.a<p> aVar4 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SelectableFilterDialog.this.dismiss();
                }
            };
            g00.a<p> aVar5 = new g00.a<p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$3
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                public /* bridge */ /* synthetic */ p invoke() {
                    invoke2();
                    return p.f75480a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    SelectableFilterDialog.this.T().z0();
                }
            };
            if (B(E0)) {
                aVar2 = r0.b.b(h11, -559207140, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar6, int i13) {
                        if ((i13 & 11) == 2 && aVar6.i()) {
                            aVar6.L();
                            return;
                        }
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.U(-559207140, i13, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.SelectableOptions.<anonymous> (SelectableFilterDialog.kt:138)");
                        }
                        float f11 = 16;
                        float f12 = 8;
                        androidx.compose.ui.c l11 = PaddingKt.l(SizeKt.h(androidx.compose.ui.c.f7566a, 0.0f, 1, null), e2.h.l(f11), e2.h.l(f12), e2.h.l(f11), e2.h.l(f12));
                        String value = k0Var.getValue();
                        androidx.compose.foundation.text.c cVar = new androidx.compose.foundation.text.c(0, false, 0, v.f9508b.b(), null, 23, null);
                        final z0.d dVar2 = dVar;
                        androidx.compose.foundation.text.b bVar = new androidx.compose.foundation.text.b(new l<d0.h, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$4.1
                            {
                                super(1);
                            }

                            public final void b(d0.h $receiver) {
                                o.i($receiver, "$this$$receiver");
                                z0.d.j(z0.d.this, false, 1, null);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(d0.h hVar) {
                                b(hVar);
                                return p.f75480a;
                            }
                        }, null, null, null, null, null, 62, null);
                        final SelectableFilterDialog selectableFilterDialog = this;
                        final j0.k0<String> k0Var2 = k0Var;
                        l<String, p> lVar = new l<String, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$4.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            public final void b(String it2) {
                                o.i(it2, "it");
                                if (!SelectableFilterDialog.this.T().T0().getValue().booleanValue()) {
                                    SelectableFilterDialog.this.T().T0().setValue(Boolean.TRUE);
                                }
                                SelectableFilterDialog.this.T().G0().setValue(it2);
                                k0Var2.setValue(it2);
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(String str2) {
                                b(str2);
                                return p.f75480a;
                            }
                        };
                        final String str2 = str;
                        InputsKt.i(l11, value, lVar, null, false, 0, 0, r0.b.b(aVar6, 1611666172, true, new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$4.3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final void b(androidx.compose.runtime.a aVar7, int i14) {
                                String c11;
                                if ((i14 & 11) == 2 && aVar7.i()) {
                                    aVar7.L();
                                    return;
                                }
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.U(1611666172, i14, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.SelectableOptions.<anonymous>.<anonymous> (SelectableFilterDialog.kt:141)");
                                }
                                String str3 = str2;
                                aVar7.C(-1701993677);
                                if (str3 == null) {
                                    c11 = null;
                                } else {
                                    c11 = p1.g.c(y0.f70789zd, new Object[]{str3}, aVar7, 64);
                                }
                                aVar7.S();
                                if (c11 == null) {
                                    c11 = "";
                                }
                                TextKt.a(c11, null, 0, 0, false, 0, 0, null, null, 0L, 0, aVar7, 0, 0, 2046);
                                if (androidx.compose.runtime.c.I()) {
                                    androidx.compose.runtime.c.T();
                                }
                            }

                            @Override // g00.p
                            public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar7, Integer num) {
                                b(aVar7, num.intValue());
                                return p.f75480a;
                            }
                        }), dVar, null, null, cVar, bVar, null, null, aVar6, 146800640, 48, 26232);
                        if (androidx.compose.runtime.c.I()) {
                            androidx.compose.runtime.c.T();
                        }
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
            SheetsViewKt.c(a12, A, i12, aVar3, aVar4, aVar5, aVar2, r0.b.b(h11, 1287952427, true, new q<androidx.compose.ui.c, androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$5
                /* JADX INFO: Access modifiers changed from: package-private */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                public final void b(androidx.compose.ui.c it2, androidx.compose.runtime.a aVar6, int i13) {
                    int i14;
                    boolean C;
                    int i15;
                    o.i(it2, "it");
                    if ((i13 & 14) == 0) {
                        if (aVar6.T(it2)) {
                            i15 = 4;
                        } else {
                            i15 = 2;
                        }
                        i14 = i15 | i13;
                    } else {
                        i14 = i13;
                    }
                    if ((i14 & 91) == 18 && aVar6.i()) {
                        aVar6.L();
                        return;
                    }
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.U(1287952427, i13, -1, "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog.SelectableOptions.<anonymous> (SelectableFilterDialog.kt:152)");
                    }
                    androidx.compose.ui.c b11 = BackgroundKt.b(SizeKt.h(androidx.compose.ui.input.nestedscroll.a.b(it2, aj.c.e(null, aVar6, 0, 1), null, 2, null), 0.0f, 1, null), dk.a.f54291a.a(aVar6, dk.a.f54292b).e().h(aVar6, yj.d.f76453b), null, 2, null);
                    SelectableFilterDialog selectableFilterDialog = SelectableFilterDialog.this;
                    j0.k0<String> k0Var2 = k0Var;
                    j0.k0<Boolean> k0Var3 = S0;
                    aVar6.C(-483455358);
                    a0 a13 = androidx.compose.foundation.layout.e.a(Arrangement.f3698a.h(), v0.b.f74009a.k(), aVar6, 0);
                    aVar6.C(-1323940314);
                    int a14 = e.a(aVar6, 0);
                    k s11 = aVar6.s();
                    ComposeUiNode.Companion companion = ComposeUiNode.f8256m;
                    g00.a<ComposeUiNode> a15 = companion.a();
                    q<e1<ComposeUiNode>, androidx.compose.runtime.a, Integer, p> c11 = LayoutKt.c(b11);
                    if (!(aVar6.k() instanceof j0.d)) {
                        e.c();
                    }
                    aVar6.I();
                    if (aVar6.f()) {
                        aVar6.y(a15);
                    } else {
                        aVar6.t();
                    }
                    androidx.compose.runtime.a a16 = Updater.a(aVar6);
                    Updater.c(a16, a13, companion.e());
                    Updater.c(a16, s11, companion.g());
                    g00.p<ComposeUiNode, Integer, p> b12 = companion.b();
                    if (a16.f() || !o.d(a16.D(), Integer.valueOf(a14))) {
                        a16.u(Integer.valueOf(a14));
                        a16.p(Integer.valueOf(a14), b12);
                    }
                    c11.invoke(e1.a(e1.b(aVar6)), aVar6, 0);
                    aVar6.C(2058660585);
                    w.f fVar = w.f.f74891a;
                    C = SelectableFilterDialog.C(k0Var3);
                    if (C) {
                        aVar6.C(-1701992794);
                        selectableFilterDialog.r(k0Var2.getValue(), aVar6, 64);
                        aVar6.S();
                    } else {
                        aVar6.C(-1701992693);
                        selectableFilterDialog.x(k0Var2.getValue(), aVar6, 64);
                        aVar6.S();
                    }
                    aVar6.S();
                    aVar6.w();
                    aVar6.S();
                    aVar6.S();
                    if (androidx.compose.runtime.c.I()) {
                        androidx.compose.runtime.c.T();
                    }
                }

                @Override // g00.q
                public /* bridge */ /* synthetic */ p invoke(androidx.compose.ui.c cVar, androidx.compose.runtime.a aVar6, Integer num) {
                    b(cVar, aVar6, num.intValue());
                    return p.f75480a;
                }
            }), h11, 12582912, 0);
            if (androidx.compose.runtime.c.I()) {
                androidx.compose.runtime.c.T();
            }
            d1 l11 = h11.l();
            if (l11 != null) {
                l11.a(new g00.p<androidx.compose.runtime.a, Integer, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog$SelectableOptions$6
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    public final void b(androidx.compose.runtime.a aVar6, int i13) {
                        SelectableFilterDialog.this.z(aVar6, v0.a(i11 | 1));
                    }

                    @Override // g00.p
                    public /* bridge */ /* synthetic */ p invoke(androidx.compose.runtime.a aVar6, Integer num) {
                        b(aVar6, num.intValue());
                        return p.f75480a;
                    }
                });
            }
        }
    }
