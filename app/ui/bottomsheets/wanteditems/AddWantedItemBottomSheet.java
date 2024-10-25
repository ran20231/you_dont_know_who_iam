package com.forsale.app.ui.bottomsheets.wanteditems;

import aa.m1;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.fragment.app.w;
import androidx.lifecycle.l;
import androidx.lifecycle.t0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.forsale.app.features.postad.location.LocationLevels;
import com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet;
import com.forsale.app.ui.bottomsheets.wanteditems.b;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.FragmentsExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.y0;
import t9.z0;
import w3.a;
import wz.p;
/* compiled from: AddWantedItemBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class AddWantedItemBottomSheet extends j {

    /* renamed from: g  reason: collision with root package name */
    private final wz.h f39212g;

    /* renamed from: h  reason: collision with root package name */
    private final z3.i f39213h;

    /* renamed from: i  reason: collision with root package name */
    private m1 f39214i;

    /* compiled from: AddWantedItemBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class a implements FlowCollector<p> {
        a() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            AddWantedItemBottomSheet.this.x();
            return p.f75480a;
        }
    }

    /* compiled from: AddWantedItemBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            w.b(AddWantedItemBottomSheet.this, "wanted Item changed", new Bundle());
            AddWantedItemBottomSheet.this.z().A0();
            AddWantedItemBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public AddWantedItemBottomSheet() {
        final wz.h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = kotlin.d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f39212g = FragmentViewModelLazyKt.b(this, s.b(AddWantedItemViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final w0 invoke() {
                x0 c11;
                c11 = FragmentViewModelLazyKt.c(wz.h.this);
                return c11.getViewModelStore();
            }
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$viewModels$default$5
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
        this.f39213h = new z3.i(s.b(com.forsale.app.ui.bottomsheets.wanteditems.a.class), new g00.a<Bundle>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$special$$inlined$navArgs$1
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        FragmentsExtensionsKt.a(this, b.C0442b.b(com.forsale.app.ui.bottomsheets.wanteditems.b.f39284a, false, 1, null));
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        m1 f02 = m1.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39214i = f02;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        return f02.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        m1 m1Var = this.f39214i;
        m1 m1Var2 = null;
        if (m1Var == null) {
            o.w("binding");
            m1Var = null;
        }
        m1Var.h0(z());
        m1 m1Var3 = this.f39214i;
        if (m1Var3 == null) {
            o.w("binding");
        } else {
            m1Var2 = m1Var3;
        }
        m1Var2.U(getViewLifecycleOwner());
        z().B0().postValue(y().a());
        OneShotEventHandler<p> E0 = z().E0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        E0.h(viewLifecycleOwner, new a());
        OneShotEventHandler<p> L0 = z().L0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        L0.h(viewLifecycleOwner2, new FlowCollector<p>() { // from class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(p pVar, zz.a<? super p> aVar) {
                DistrictsSelectorBottomSheet.a aVar2 = DistrictsSelectorBottomSheet.E;
                int level = LocationLevels.DISTRICT.getLevel();
                FragmentManager childFragmentManager = AddWantedItemBottomSheet.this.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                final AddWantedItemBottomSheet addWantedItemBottomSheet = AddWantedItemBottomSheet.this;
                aVar2.a(level, childFragmentManager, 
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x001a: INVOKE  
                      (r4v1 'aVar2' com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet$a)
                      (r5v2 'level' int)
                      (r0v1 'childFragmentManager' androidx.fragment.app.FragmentManager)
                      (wrap: g00.l<com.forsale.app.datalayer.database.DistrictEntity, wz.p> : 0x0017: CONSTRUCTOR  (r1v1 g00.l<com.forsale.app.datalayer.database.DistrictEntity, wz.p> A[REMOVE]) = (r2v0 'addWantedItemBottomSheet' com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet A[DONT_INLINE]) call: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2$emit$2.<init>(com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet):void type: CONSTRUCTOR)
                     type: VIRTUAL call: com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet.a.a(int, androidx.fragment.app.FragmentManager, g00.l):void in method: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2.a(wz.p, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:309)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2$emit$2, state: NOT_LOADED
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
                    	... 15 more
                    */
                /*
                    this = this;
                    com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet$a r4 = com.forsale.app.ui.bottomsheets.postaddistricts.DistrictsSelectorBottomSheet.E
                    com.forsale.app.features.postad.location.LocationLevels r5 = com.forsale.app.features.postad.location.LocationLevels.DISTRICT
                    int r5 = r5.getLevel()
                    com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet r0 = com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet.this
                    androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
                    java.lang.String r1 = "getChildFragmentManager(...)"
                    kotlin.jvm.internal.o.h(r0, r1)
                    com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2$emit$2 r1 = new com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2$emit$2
                    com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet r2 = com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet.this
                    r1.<init>(r2)
                    r4.a(r5, r0, r1)
                    wz.p r4 = wz.p.f75480a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.wanteditems.AddWantedItemBottomSheet$onViewCreated$2.emit(wz.p, zz.a):java.lang.Object");
            }
        });
        OneShotEventHandler<p> J0 = z().J0();
        androidx.lifecycle.s viewLifecycleOwner3 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        J0.h(viewLifecycleOwner3, new b());
        OneShotEventHandler<p> G0 = z().G0();
        androidx.lifecycle.s viewLifecycleOwner4 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        G0.h(viewLifecycleOwner4, new c());
    }

    public final com.forsale.app.ui.bottomsheets.wanteditems.a y() {
        return (com.forsale.app.ui.bottomsheets.wanteditems.a) this.f39213h.getValue();
    }

    public final AddWantedItemViewModel z() {
        return (AddWantedItemViewModel) this.f39212g.getValue();
    }

    /* compiled from: AddWantedItemBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            AddWantedItemBottomSheet.this.dismiss();
            Context requireContext = AddWantedItemBottomSheet.this.requireContext();
            o.h(requireContext, "requireContext(...)");
            String string = AddWantedItemBottomSheet.this.getString(y0.f70477gf);
            o.h(string, "getString(...)");
            if (ContextExtensionsKt.f(requireContext)) {
                c.a aVar2 = new c.a(requireContext);
                aVar2.o(y0.M4);
                aVar2.h(string);
                aVar2.m(requireContext.getString(y0.Z4), new a());
                aVar2.d(false);
                aVar2.q();
            }
            return p.f75480a;
        }

        /* compiled from: ViewsExtensions.kt */
        /* loaded from: classes3.dex */
        public static final class a implements DialogInterface.OnClickListener {
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
            }
        }
    }
}
