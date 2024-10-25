package com.forsale.app.features.more.user.profile;

import com.forsale.app.datalayer.repositories.SocialMediaRepository;
import com.forsale.app.utils.analytics.LinkType;
import com.forsale.app.utils.prefUtils.preferences.SocialMediaPrefs;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.more.user.profile.NewProfileViewModel$onInstagramClick$1", f = "NewProfileViewModel.kt", l = {348, 346}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewProfileViewModel$onInstagramClick$1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f33602a;

    /* renamed from: b  reason: collision with root package name */
    int f33603b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ NewProfileViewModel f33604c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewProfileViewModel$onInstagramClick$1(NewProfileViewModel newProfileViewModel, zz.a<? super NewProfileViewModel$onInstagramClick$1> aVar) {
        super(2, aVar);
        this.f33604c = newProfileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new NewProfileViewModel$onInstagramClick$1(this.f33604c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        SocialMediaRepository socialMediaRepository;
        f fVar;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f33603b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    kotlin.f.b(obj);
                    fVar = this.f33604c.f33542c;
                    fVar.i(new yi.b(LinkType.INSTAGRAM));
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f33602a;
            kotlin.f.b(obj);
        } else {
            kotlin.f.b(obj);
            mutableSharedFlow = this.f33604c.C;
            socialMediaRepository = this.f33604c.f33548i;
            SocialMediaPrefs.SocialMediaTypes socialMediaTypes = SocialMediaPrefs.SocialMediaTypes.INSTAGRAM;
            this.f33602a = mutableSharedFlow;
            this.f33603b = 1;
            obj = socialMediaRepository.getSocialMediaLink(socialMediaTypes, this);
            if (obj == f11) {
                return f11;
            }
        }
        v vVar = new v((String) obj);
        this.f33602a = null;
        this.f33603b = 2;
        if (mutableSharedFlow.emit(vVar, this) == f11) {
            return f11;
        }
        fVar = this.f33604c.f33542c;
        fVar.i(new yi.b(LinkType.INSTAGRAM));
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((NewProfileViewModel$onInstagramClick$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
