package com.forsale.app.notifications.leanplum;

import android.content.ContextWrapper;
import androidx.lifecycle.s;
import com.leanplum.ActionArgs;
import com.leanplum.ActionContext;
import com.leanplum.Leanplum;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.callbacks.ActionCallback;
import com.leanplum.internal.Constants;
import kotlin.jvm.internal.o;
/* compiled from: InAppMessageWithTwoActionTemplate.kt */
/* loaded from: classes2.dex */
public final class InAppMessageWithTwoActionTemplate {

    /* renamed from: a  reason: collision with root package name */
    private final String f37630a = "InAppMessageWithTwoAction";

    /* compiled from: InAppMessageWithTwoActionTemplate.kt */
    /* loaded from: classes2.dex */
    public static final class a extends ActionCallback {
        a() {
        }

        @Override // com.leanplum.callbacks.ActionCallback
        public boolean onResponse(ActionContext actionContext) {
            if (actionContext != null) {
                actionContext.actionDismissed();
                return true;
            }
            return true;
        }
    }

    public final void a(final ContextWrapper contextWrapper, final s lifecycleOwner) {
        o.i(contextWrapper, "contextWrapper");
        o.i(lifecycleOwner, "lifecycleOwner");
        Leanplum.defineAction(this.f37630a, 3, new ActionArgs().with(Constants.Params.MESSAGE, "enter message").with("first_en_button_title", "enter title in english").with("first_ar_button_title", "enter title in arabic").with("first_action_url", "enter url").with("second_en_button_title", "enter title in english").with("second_ar_button_title", "enter title in arabic").with("second_action_url", "enter url"), new ActionCallback() { // from class: com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1
            @Override // com.leanplum.callbacks.ActionCallback
            public boolean onResponse(final ActionContext context) {
                o.i(context, "context");
                final s sVar = s.this;
                final ContextWrapper contextWrapper2 = contextWrapper;
                LeanplumActivityHelper.queueActionUponActive(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: INVOKE  
                      (wrap: com.leanplum.callbacks.VariablesChangedCallback : 0x000b: CONSTRUCTOR  (r0v1 com.leanplum.callbacks.VariablesChangedCallback A[REMOVE]) = 
                      (r1v0 'sVar' androidx.lifecycle.s A[DONT_INLINE])
                      (r2v0 'contextWrapper2' android.content.ContextWrapper A[DONT_INLINE])
                      (r4v0 'context' com.leanplum.ActionContext A[DONT_INLINE])
                     call: com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1$onResponse$1.<init>(androidx.lifecycle.s, android.content.ContextWrapper, com.leanplum.ActionContext):void type: CONSTRUCTOR)
                     type: STATIC call: com.leanplum.LeanplumActivityHelper.queueActionUponActive(java.lang.Runnable):void in method: com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1.onResponse(com.leanplum.ActionContext):boolean, file: classes2.dex
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1$onResponse$1, state: NOT_LOADED
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
                    java.lang.String r0 = "context"
                    kotlin.jvm.internal.o.i(r4, r0)
                    com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1$onResponse$1 r0 = new com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1$onResponse$1
                    androidx.lifecycle.s r1 = androidx.lifecycle.s.this
                    android.content.ContextWrapper r2 = r2
                    r0.<init>(r1, r2, r4)
                    com.leanplum.LeanplumActivityHelper.queueActionUponActive(r0)
                    r4 = 1
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.notifications.leanplum.InAppMessageWithTwoActionTemplate$register$1.onResponse(com.leanplum.ActionContext):boolean");
            }
        }, new a());
    }
}
