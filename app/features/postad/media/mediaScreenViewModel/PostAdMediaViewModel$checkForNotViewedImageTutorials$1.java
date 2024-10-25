package com.forsale.app.features.postad.media.mediaScreenViewModel;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PostAdMediaViewModel.kt */
@d(c = "com.forsale.app.features.postad.media.mediaScreenViewModel.PostAdMediaViewModel", f = "PostAdMediaViewModel.kt", l = {339}, m = "checkForNotViewedImageTutorials")
/* loaded from: classes2.dex */
public final class PostAdMediaViewModel$checkForNotViewedImageTutorials$1 extends ContinuationImpl {

    /* renamed from: a  reason: collision with root package name */
    Object f36303a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f36304b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ PostAdMediaViewModel f36305c;

    /* renamed from: d  reason: collision with root package name */
    int f36306d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostAdMediaViewModel$checkForNotViewedImageTutorials$1(PostAdMediaViewModel postAdMediaViewModel, a<? super PostAdMediaViewModel$checkForNotViewedImageTutorials$1> aVar) {
        super(aVar);
        this.f36305c = postAdMediaViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f36304b = obj;
        this.f36306d |= Integer.MIN_VALUE;
        return this.f36305c.C0(this);
    }
}
