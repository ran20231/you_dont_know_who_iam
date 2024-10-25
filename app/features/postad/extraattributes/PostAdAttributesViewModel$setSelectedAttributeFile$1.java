package com.forsale.app.features.postad.extraattributes;

import g00.p;
import java.io.File;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$setSelectedAttributeFile$1", f = "PostAdAttributesViewModel.kt", l = {244}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$setSelectedAttributeFile$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35159a;

    /* renamed from: b  reason: collision with root package name */
    Object f35160b;

    /* renamed from: c  reason: collision with root package name */
    int f35161c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35162d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ File f35163e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$setSelectedAttributeFile$1(PostAdAttributesViewModel postAdAttributesViewModel, File file, zz.a<? super PostAdAttributesViewModel$setSelectedAttributeFile$1> aVar) {
        super(2, aVar);
        this.f35162d = postAdAttributesViewModel;
        this.f35163e = file;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$setSelectedAttributeFile$1(this.f35162d, this.f35163e, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0078 A[EDGE_INSN: B:37:0x0078->B:24:0x0078 ?: BREAK  , SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r10.f35161c
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r10.f35160b
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r1 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r1
            java.lang.Object r1 = r10.f35159a
            java.util.Iterator r1 = (java.util.Iterator) r1
            kotlin.f.b(r11)
            goto L2d
        L17:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1f:
            kotlin.f.b(r11)
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r11 = r10.f35162d
            java.util.ArrayList r11 = r11.L0()
            java.util.Iterator r11 = r11.iterator()
            r1 = r11
        L2d:
            r11 = r10
        L2e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L8b
            java.lang.Object r3 = r1.next()
            com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel r3 = (com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel) r3
            java.util.List r4 = r3.a()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r5 = r11.f35162d
            java.util.Iterator r4 = r4.iterator()
        L46:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L77
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r7 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r7
            java.lang.String r8 = r7.getType()
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r9 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.FILE
            java.lang.String r9 = r9.getValue()
            boolean r8 = kotlin.jvm.internal.o.d(r8, r9)
            if (r8 == 0) goto L73
            int r7 = r7.getId()
            androidx.databinding.ObservableInt r8 = com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.x0(r5)
            int r8 = r8.j()
            if (r7 != r8) goto L73
            r7 = r2
            goto L74
        L73:
            r7 = 0
        L74:
            if (r7 == 0) goto L46
            goto L78
        L77:
            r6 = 0
        L78:
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r6 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r6
            if (r6 == 0) goto L2e
            java.io.File r4 = r11.f35163e
            r11.f35159a = r1
            r11.f35160b = r6
            r11.f35161c = r2
            java.lang.Object r3 = r3.l(r4, r11)
            if (r3 != r0) goto L2e
            return r0
        L8b:
            wz.p r11 = wz.p.f75480a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$setSelectedAttributeFile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$setSelectedAttributeFile$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
