package com.forsale.app.features.postad.extraattributes;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdAttributesViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$initItemViewModels$2", f = "PostAdAttributesViewModel.kt", l = {136}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PostAdAttributesViewModel$initItemViewModels$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35148a;

    /* renamed from: b  reason: collision with root package name */
    Object f35149b;

    /* renamed from: c  reason: collision with root package name */
    Object f35150c;

    /* renamed from: d  reason: collision with root package name */
    Object f35151d;

    /* renamed from: e  reason: collision with root package name */
    Object f35152e;

    /* renamed from: f  reason: collision with root package name */
    int f35153f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ PostAdAttributesViewModel f35154g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdAttributesViewModel$initItemViewModels$2(PostAdAttributesViewModel postAdAttributesViewModel, zz.a<? super PostAdAttributesViewModel$initItemViewModels$2> aVar) {
        super(2, aVar);
        this.f35154g = postAdAttributesViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PostAdAttributesViewModel$initItemViewModels$2(this.f35154g, aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004b -> B:12:0x005d). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r13.f35153f
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.lang.Object r1 = r13.f35152e
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r1 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r1
            java.lang.Object r1 = r13.f35151d
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r3 = r13.f35150c
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$a r3 = (com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.a) r3
            java.lang.Object r4 = r13.f35149b
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r13.f35148a
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r5 = (com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel) r5
            kotlin.f.b(r14)
            r14 = r4
            r4 = r3
            r3 = r5
            r5 = r13
            goto L5d
        L27:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2f:
            kotlin.f.b(r14)
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r14 = r13.f35154g
            com.forsale.app.features.postad.PostAdViewModel r14 = r14.O0()
            java.util.List r14 = r14.X1()
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel r1 = r13.f35154g
            java.util.Iterator r14 = r14.iterator()
            r3 = r13
        L45:
            boolean r4 = r14.hasNext()
            if (r4 == 0) goto Lbf
            java.lang.Object r4 = r14.next()
            com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$a r4 = (com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel.a) r4
            java.util.ArrayList r5 = r1.L0()
            java.util.Iterator r5 = r5.iterator()
            r12 = r3
            r3 = r1
            r1 = r5
            r5 = r12
        L5d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto Lbc
            java.lang.Object r6 = r1.next()
            com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel r6 = (com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItemViewModel) r6
            java.util.List r7 = r6.a()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L73:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La0
            java.lang.Object r8 = r7.next()
            r9 = r8
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r9 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r9
            java.lang.String r10 = r9.getType()
            com.forsale.app.features.postad.extraattributes.enums.AttributeType r11 = com.forsale.app.features.postad.extraattributes.enums.AttributeType.FILE
            java.lang.String r11 = r11.getValue()
            boolean r10 = kotlin.jvm.internal.o.d(r10, r11)
            if (r10 == 0) goto L9c
            int r9 = r9.getId()
            int r10 = r4.a()
            if (r9 != r10) goto L9c
            r9 = r2
            goto L9d
        L9c:
            r9 = 0
        L9d:
            if (r9 == 0) goto L73
            goto La1
        La0:
            r8 = 0
        La1:
            com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity r8 = (com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity) r8
            if (r8 == 0) goto L5d
            java.io.File r7 = r4.b()
            r5.f35148a = r3
            r5.f35149b = r14
            r5.f35150c = r4
            r5.f35151d = r1
            r5.f35152e = r8
            r5.f35153f = r2
            java.lang.Object r6 = r6.l(r7, r5)
            if (r6 != r0) goto L5d
            return r0
        Lbc:
            r1 = r3
            r3 = r5
            goto L45
        Lbf:
            wz.p r14 = wz.p.f75480a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.PostAdAttributesViewModel$initItemViewModels$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PostAdAttributesViewModel$initItemViewModels$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
