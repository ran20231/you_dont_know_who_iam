package com.forsale.app.domainlayer.interactors.categoriesinteractors;

import g00.p;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GetHomeSectionsInteractor.kt */
@d(c = "com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$invoke$2", f = "GetHomeSectionsInteractor.kt", l = {33, 35, 39, 42, 44, 49}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class GetHomeSectionsInteractor$invoke$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super Pair<? extends List<? extends a>, ? extends String>>, Object> {
    private /* synthetic */ Object A;
    final /* synthetic */ GetHomeSectionsInteractor B;

    /* renamed from: a  reason: collision with root package name */
    Object f22420a;

    /* renamed from: b  reason: collision with root package name */
    Object f22421b;

    /* renamed from: c  reason: collision with root package name */
    Object f22422c;

    /* renamed from: d  reason: collision with root package name */
    Object f22423d;

    /* renamed from: e  reason: collision with root package name */
    Object f22424e;

    /* renamed from: f  reason: collision with root package name */
    Object f22425f;

    /* renamed from: g  reason: collision with root package name */
    Object f22426g;

    /* renamed from: h  reason: collision with root package name */
    Object f22427h;

    /* renamed from: i  reason: collision with root package name */
    Object f22428i;

    /* renamed from: j  reason: collision with root package name */
    Object f22429j;

    /* renamed from: x  reason: collision with root package name */
    Object f22430x;

    /* renamed from: y  reason: collision with root package name */
    Object f22431y;

    /* renamed from: z  reason: collision with root package name */
    int f22432z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetHomeSectionsInteractor$invoke$2(GetHomeSectionsInteractor getHomeSectionsInteractor, zz.a<? super GetHomeSectionsInteractor$invoke$2> aVar) {
        super(2, aVar);
        this.B = getHomeSectionsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        GetHomeSectionsInteractor$invoke$2 getHomeSectionsInteractor$invoke$2 = new GetHomeSectionsInteractor$invoke$2(this.B, aVar);
        getHomeSectionsInteractor$invoke$2.A = obj;
        return getHomeSectionsInteractor$invoke$2;
    }

    @Override // g00.p
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, zz.a<? super Pair<? extends List<? extends a>, ? extends String>> aVar) {
        return invoke2(coroutineScope, (zz.a<? super Pair<? extends List<a>, String>>) aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0134 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0284 A[LOOP:0: B:43:0x027e->B:45:0x0284, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x032c  */
    /* JADX WARN: Type inference failed for: r11v12, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x025c -> B:42:0x0268). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0316 -> B:52:0x0320). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.domainlayer.interactors.categoriesinteractors.GetHomeSectionsInteractor$invoke$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, zz.a<? super Pair<? extends List<a>, String>> aVar) {
        return ((GetHomeSectionsInteractor$invoke$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
