package com.forsale.app.ui.bottomsheets.support;

import aa.u1;
import android.annotation.SuppressLint;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.database.ContactData;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.core.util.ContextExtensionKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import w3.a;
import wz.h;
import wz.p;
/* compiled from: SupportCallUsBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class SupportCallUsBottomSheet extends com.forsale.app.ui.bottomsheets.support.a {

    /* renamed from: i  reason: collision with root package name */
    public static final a f39105i = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public static final int f39106j = 8;

    /* renamed from: g  reason: collision with root package name */
    private final h f39107g;

    /* renamed from: h  reason: collision with root package name */
    private u1 f39108h;

    /* compiled from: SupportCallUsBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SupportCallUsBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<p> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            SupportCallUsBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public SupportCallUsBottomSheet() {
        final h b11;
        final g00.a<Fragment> aVar = new g00.a<Fragment>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final Fragment invoke() {
                return Fragment.this;
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new g00.a<x0>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final x0 invoke() {
                return (x0) g00.a.this.invoke();
            }
        });
        this.f39107g = FragmentViewModelLazyKt.b(this, s.b(SupportCallUsViewModel.class), new g00.a<w0>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$special$$inlined$viewModels$default$3
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
        }, new g00.a<w3.a>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$special$$inlined$viewModels$default$4
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
        }, new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$special$$inlined$viewModels$default$5
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
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        u1 f02 = u1.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f39108h = f02;
        u1 u1Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        u1 u1Var2 = this.f39108h;
        if (u1Var2 == null) {
            o.w("binding");
            u1Var2 = null;
        }
        u1Var2.h0(w());
        u1 u1Var3 = this.f39108h;
        if (u1Var3 == null) {
            o.w("binding");
        } else {
            u1Var = u1Var3;
        }
        final RecyclerView recyclerView = u1Var.O;
        Context context = recyclerView.getContext();
        if (context != null) {
            o.f(context);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(new oh.a(w()));
            OneShotEventHandler<p> A0 = w().A0();
            androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
            o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            A0.h(viewLifecycleOwner, new b());
            OneShotEventHandler<ContactData> z02 = w().z0();
            androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
            o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
            z02.h(viewLifecycleOwner2, new FlowCollector<ContactData>() { // from class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2
                @Override // kotlinx.coroutines.flow.FlowCollector
                /* renamed from: a */
                public final Object emit(ContactData contactData, zz.a<? super p> aVar) {
                    String str;
                    boolean z11;
                    boolean K0;
                    ContactData g11 = SupportCallUsBottomSheet.this.w().z0().g();
                    if (g11 != null) {
                        str = g11.getPhone();
                    } else {
                        str = null;
                    }
                    if (str != null && str.length() != 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        K0 = StringsKt__StringsKt.K0(str, '+', false, 2, null);
                        if (!K0) {
                            str = "+" + str;
                        }
                        Context context2 = recyclerView.getContext();
                        if (context2 != null) {
                            final RecyclerView recyclerView2 = recyclerView;
                            final SupportCallUsBottomSheet supportCallUsBottomSheet = SupportCallUsBottomSheet.this;
                            ContextExtensionKt.a(context2, str, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0053: INVOKE  
                                  (r5v4 'context2' android.content.Context)
                                  (r4v10 'str' java.lang.String)
                                  (wrap: g00.l<java.lang.Exception, wz.p> : 0x0050: CONSTRUCTOR  (r0v1 g00.l<java.lang.Exception, wz.p> A[REMOVE]) = 
                                  (r1v3 'recyclerView2' androidx.recyclerview.widget.RecyclerView A[DONT_INLINE])
                                  (r2v1 'supportCallUsBottomSheet' com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet A[DONT_INLINE])
                                 call: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2$emit$2.<init>(androidx.recyclerview.widget.RecyclerView, com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet):void type: CONSTRUCTOR)
                                 type: STATIC call: com.forsale.core.util.ContextExtensionKt.a(android.content.Context, java.lang.String, g00.l):void in method: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2.a(com.forsale.app.datalayer.database.ContactData, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2$emit$2, state: NOT_LOADED
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
                                	... 27 more
                                */
                            /*
                                this = this;
                                com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet r4 = com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet.this
                                com.forsale.app.ui.bottomsheets.support.SupportCallUsViewModel r4 = r4.w()
                                com.forsale.app.utils.OneShotEventHandler r4 = r4.z0()
                                java.lang.Object r4 = r4.g()
                                com.forsale.app.datalayer.database.ContactData r4 = (com.forsale.app.datalayer.database.ContactData) r4
                                r5 = 0
                                if (r4 == 0) goto L18
                                java.lang.String r4 = r4.getPhone()
                                goto L19
                            L18:
                                r4 = r5
                            L19:
                                r0 = 0
                                if (r4 == 0) goto L25
                                int r1 = r4.length()
                                if (r1 != 0) goto L23
                                goto L25
                            L23:
                                r1 = r0
                                goto L26
                            L25:
                                r1 = 1
                            L26:
                                if (r1 != 0) goto L56
                                r1 = 43
                                r2 = 2
                                boolean r5 = kotlin.text.k.K0(r4, r1, r0, r2, r5)
                                if (r5 != 0) goto L42
                                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                                r5.<init>()
                                java.lang.String r0 = "+"
                                r5.append(r0)
                                r5.append(r4)
                                java.lang.String r4 = r5.toString()
                            L42:
                                androidx.recyclerview.widget.RecyclerView r5 = r2
                                android.content.Context r5 = r5.getContext()
                                if (r5 == 0) goto L56
                                com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2$emit$2 r0 = new com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2$emit$2
                                androidx.recyclerview.widget.RecyclerView r1 = r2
                                com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet r2 = com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet.this
                                r0.<init>(r1, r2)
                                com.forsale.core.util.ContextExtensionKt.a(r5, r4, r0)
                            L56:
                                com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet r4 = com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet.this
                                r4.dismiss()
                                wz.p r4 = wz.p.f75480a
                                return r4
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.support.SupportCallUsBottomSheet$onCreateView$1$1$1$2.emit(com.forsale.app.datalayer.database.ContactData, zz.a):java.lang.Object");
                        }
                    });
                }
                return root;
            }

            public final SupportCallUsViewModel w() {
                return (SupportCallUsViewModel) this.f39107g.getValue();
            }
        }
