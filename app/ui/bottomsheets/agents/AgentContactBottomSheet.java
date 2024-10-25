package com.forsale.app.ui.bottomsheets.agents;

import aa.q0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.database.AgentEntity;
import com.forsale.app.features.more.agents.list.AgentContactType;
import com.forsale.app.ui.bottomsheets.agents.AgentContactViewModel;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.forsale.core.util.ContextExtensionKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: AgentContactBottomSheet.kt */
@SuppressLint({"ValidFragment"})
/* loaded from: classes3.dex */
public final class AgentContactBottomSheet extends b {

    /* renamed from: g  reason: collision with root package name */
    private final AgentContactType f37870g;

    /* renamed from: h  reason: collision with root package name */
    private q0 f37871h;

    /* renamed from: i  reason: collision with root package name */
    public AgentContactViewModel.a f37872i;

    /* renamed from: j  reason: collision with root package name */
    private final h f37873j;

    public AgentContactBottomSheet(final AgentEntity agent, AgentContactType agentContactType) {
        h b11;
        o.i(agent, "agent");
        o.i(agentContactType, "agentContactType");
        this.f37870g = agentContactType;
        g00.a<t0.b> aVar = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ AgentContactBottomSheet f37877f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ AgentEntity f37878g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, AgentContactBottomSheet agentContactBottomSheet, AgentEntity agentEntity) {
                    super(fragment, bundle);
                    this.f37877f = agentContactBottomSheet;
                    this.f37878g = agentEntity;
                }

                @Override // androidx.lifecycle.a
                protected <T extends androidx.lifecycle.q0> T e(String key, Class<T> modelClass, k0 handle) {
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    AgentContactViewModel a11 = this.f37877f.w().a(this.f37878g, t.a(this.f37877f));
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
                return new a(Fragment.this, Fragment.this.getArguments(), this, agent);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.f37873j = FragmentViewModelLazyKt.b(this, s.b(AgentContactViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar);
    }

    @Override // androidx.fragment.app.j
    public int getTheme() {
        return z0.f70792b;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.i(inflater, "inflater");
        q0 f02 = q0.f0(inflater, viewGroup, false);
        o.h(f02, "inflate(...)");
        this.f37871h = f02;
        q0 q0Var = null;
        if (f02 == null) {
            o.w("binding");
            f02 = null;
        }
        View root = f02.getRoot();
        x().C0(this.f37870g);
        q0 q0Var2 = this.f37871h;
        if (q0Var2 == null) {
            o.w("binding");
        } else {
            q0Var = q0Var2;
        }
        q0Var.h0(x());
        OneShotEventHandler<String> w02 = x().w0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        w02.h(viewLifecycleOwner, new FlowCollector<String>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a */
            public final Object emit(String str, zz.a<? super p> aVar) {
                if (str != null) {
                    final AgentContactBottomSheet agentContactBottomSheet = AgentContactBottomSheet.this;
                    agentContactBottomSheet.dismiss();
                    Context context = agentContactBottomSheet.getContext();
                    if (context != null) {
                        o.f(context);
                        ContextExtensionKt.a(context, str, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0015: INVOKE  
                              (r0v0 'context' android.content.Context)
                              (r3v0 'str' java.lang.String)
                              (wrap: g00.l<java.lang.Exception, wz.p> : 0x0012: CONSTRUCTOR  (r1v0 g00.l<java.lang.Exception, wz.p> A[REMOVE]) = (r4v1 'agentContactBottomSheet' com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet A[DONT_INLINE]) call: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1$emit$2$1.<init>(com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet):void type: CONSTRUCTOR)
                             type: STATIC call: com.forsale.core.util.ContextExtensionKt.a(android.content.Context, java.lang.String, g00.l):void in method: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1.a(java.lang.String, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1$emit$2$1, state: NOT_LOADED
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
                            if (r3 == 0) goto L18
                            com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet r4 = com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet.this
                            r4.dismiss()
                            android.content.Context r0 = r4.getContext()
                            if (r0 == 0) goto L18
                            kotlin.jvm.internal.o.f(r0)
                            com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1$emit$2$1 r1 = new com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1$emit$2$1
                            r1.<init>(r4)
                            com.forsale.core.util.ContextExtensionKt.a(r0, r3, r1)
                        L18:
                            wz.p r3 = wz.p.f75480a
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$1.emit(java.lang.String, zz.a):java.lang.Object");
                    }
                });
                OneShotEventHandler<String> x02 = x().x0();
                androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
                o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                x02.h(viewLifecycleOwner2, new FlowCollector<String>() { // from class: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /* renamed from: a */
                    public final Object emit(String str, zz.a<? super p> aVar) {
                        if (str != null) {
                            final AgentContactBottomSheet agentContactBottomSheet = AgentContactBottomSheet.this;
                            agentContactBottomSheet.dismiss();
                            ContextExtensionsKt.K(agentContactBottomSheet, str, 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000c: INVOKE  
                                  (r3v1 'agentContactBottomSheet' com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet)
                                  (r2v0 'str' java.lang.String)
                                  (wrap: g00.l<java.lang.Exception, wz.p> : 0x0009: CONSTRUCTOR  (r0v0 g00.l<java.lang.Exception, wz.p> A[REMOVE]) = (r3v1 'agentContactBottomSheet' com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet A[DONT_INLINE]) call: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2$emit$2$1.<init>(com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet):void type: CONSTRUCTOR)
                                 type: STATIC call: com.forsale.app.utils.ContextExtensionsKt.K(androidx.fragment.app.Fragment, java.lang.String, g00.l):void in method: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2.a(java.lang.String, zz.a<? super wz.p>):java.lang.Object, file: classes3.dex
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
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
                                	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.util.ArrayList.forEach(ArrayList.java:1259)
                                	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2$emit$2$1, state: NOT_LOADED
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
                                	... 21 more
                                */
                            /*
                                this = this;
                                if (r2 == 0) goto Lf
                                com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet r3 = com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet.this
                                r3.dismiss()
                                com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2$emit$2$1 r0 = new com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2$emit$2$1
                                r0.<init>(r3)
                                com.forsale.app.utils.ContextExtensionsKt.K(r3, r2, r0)
                            Lf:
                                wz.p r2 = wz.p.f75480a
                                return r2
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.ui.bottomsheets.agents.AgentContactBottomSheet$onCreateView$1$2.emit(java.lang.String, zz.a):java.lang.Object");
                        }
                    });
                    return root;
                }

                public final AgentContactViewModel.a w() {
                    AgentContactViewModel.a aVar = this.f37872i;
                    if (aVar != null) {
                        return aVar;
                    }
                    o.w("factory");
                    return null;
                }

                public final AgentContactViewModel x() {
                    return (AgentContactViewModel) this.f37873j.getValue();
                }
            }
