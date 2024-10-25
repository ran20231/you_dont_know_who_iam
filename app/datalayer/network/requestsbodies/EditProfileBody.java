package com.forsale.app.datalayer.network.requestsbodies;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: EditProfileBody.kt */
/* loaded from: classes2.dex */
public final class EditProfileBody {
    public static final int $stable = 0;
    @c("allow_follow")
    private final Integer allowFollow;
    @c("email")
    private final String email;
    @c("first_name")
    private final String firstName;
    @c("gender")
    private final Gender gender;
    @c("last_name")
    private final String lastName;
    @c(Constants.Keys.LOCATION)
    private final ProfileLocation location;
    @c("password")
    private final String password;
    @c("dob")
    private final String profileDob;

    /* compiled from: EditProfileBody.kt */
    /* loaded from: classes2.dex */
    public static final class ProfileLocation {
        public static final int $stable = 0;
        @c(AdvancedSearchBody.GEO_LAT)
        private final Double latitude;
        @c(AdvancedSearchBody.GEO_LON)
        private final Double longitude;

        public ProfileLocation(Double d11, Double d12) {
            this.latitude = d11;
            this.longitude = d12;
        }

        public static /* synthetic */ ProfileLocation copy$default(ProfileLocation profileLocation, Double d11, Double d12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                d11 = profileLocation.latitude;
            }
            if ((i11 & 2) != 0) {
                d12 = profileLocation.longitude;
            }
            return profileLocation.copy(d11, d12);
        }

        public final Double component1() {
            return this.latitude;
        }

        public final Double component2() {
            return this.longitude;
        }

        public final ProfileLocation copy(Double d11, Double d12) {
            return new ProfileLocation(d11, d12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProfileLocation)) {
                return false;
            }
            ProfileLocation profileLocation = (ProfileLocation) obj;
            if (o.d(this.latitude, profileLocation.latitude) && o.d(this.longitude, profileLocation.longitude)) {
                return true;
            }
            return false;
        }

        public final Double getLatitude() {
            return this.latitude;
        }

        public final Double getLongitude() {
            return this.longitude;
        }

        public int hashCode() {
            int hashCode;
            Double d11 = this.latitude;
            int i11 = 0;
            if (d11 == null) {
                hashCode = 0;
            } else {
                hashCode = d11.hashCode();
            }
            int i12 = hashCode * 31;
            Double d12 = this.longitude;
            if (d12 != null) {
                i11 = d12.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            Double d11 = this.latitude;
            Double d12 = this.longitude;
            return "ProfileLocation(latitude=" + d11 + ", longitude=" + d12 + ")";
        }
    }

    public EditProfileBody(Integer num, String firstName, String lastName, String str, String email, ProfileLocation profileLocation, Gender gender, String str2) {
        o.i(firstName, "firstName");
        o.i(lastName, "lastName");
        o.i(email, "email");
        o.i(gender, "gender");
        this.allowFollow = num;
        this.firstName = firstName;
        this.lastName = lastName;
        this.profileDob = str;
        this.email = email;
        this.location = profileLocation;
        this.gender = gender;
        this.password = str2;
    }

    public static /* synthetic */ EditProfileBody copy$default(EditProfileBody editProfileBody, Integer num, String str, String str2, String str3, String str4, ProfileLocation profileLocation, Gender gender, String str5, int i11, Object obj) {
        Integer num2;
        String str6;
        String str7;
        String str8;
        String str9;
        ProfileLocation profileLocation2;
        Gender gender2;
        String str10;
        if ((i11 & 1) != 0) {
            num2 = editProfileBody.allowFollow;
        } else {
            num2 = num;
        }
        if ((i11 & 2) != 0) {
            str6 = editProfileBody.firstName;
        } else {
            str6 = str;
        }
        if ((i11 & 4) != 0) {
            str7 = editProfileBody.lastName;
        } else {
            str7 = str2;
        }
        if ((i11 & 8) != 0) {
            str8 = editProfileBody.profileDob;
        } else {
            str8 = str3;
        }
        if ((i11 & 16) != 0) {
            str9 = editProfileBody.email;
        } else {
            str9 = str4;
        }
        if ((i11 & 32) != 0) {
            profileLocation2 = editProfileBody.location;
        } else {
            profileLocation2 = profileLocation;
        }
        if ((i11 & 64) != 0) {
            gender2 = editProfileBody.gender;
        } else {
            gender2 = gender;
        }
        if ((i11 & 128) != 0) {
            str10 = editProfileBody.password;
        } else {
            str10 = str5;
        }
        return editProfileBody.copy(num2, str6, str7, str8, str9, profileLocation2, gender2, str10);
    }

    public final Integer component1() {
        return this.allowFollow;
    }

    public final String component2() {
        return this.firstName;
    }

    public final String component3() {
        return this.lastName;
    }

    public final String component4() {
        return this.profileDob;
    }

    public final String component5() {
        return this.email;
    }

    public final ProfileLocation component6() {
        return this.location;
    }

    public final Gender component7() {
        return this.gender;
    }

    public final String component8() {
        return this.password;
    }

    public final EditProfileBody copy(Integer num, String firstName, String lastName, String str, String email, ProfileLocation profileLocation, Gender gender, String str2) {
        o.i(firstName, "firstName");
        o.i(lastName, "lastName");
        o.i(email, "email");
        o.i(gender, "gender");
        return new EditProfileBody(num, firstName, lastName, str, email, profileLocation, gender, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditProfileBody)) {
            return false;
        }
        EditProfileBody editProfileBody = (EditProfileBody) obj;
        if (o.d(this.allowFollow, editProfileBody.allowFollow) && o.d(this.firstName, editProfileBody.firstName) && o.d(this.lastName, editProfileBody.lastName) && o.d(this.profileDob, editProfileBody.profileDob) && o.d(this.email, editProfileBody.email) && o.d(this.location, editProfileBody.location) && this.gender == editProfileBody.gender && o.d(this.password, editProfileBody.password)) {
            return true;
        }
        return false;
    }

    public final Integer getAllowFollow() {
        return this.allowFollow;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Gender getGender() {
        return this.gender;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final ProfileLocation getLocation() {
        return this.location;
    }

    public final String getPassword() {
        return this.password;
    }

    public final String getProfileDob() {
        return this.profileDob;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.allowFollow;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = ((((hashCode * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31;
        String str = this.profileDob;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode2) * 31) + this.email.hashCode()) * 31;
        ProfileLocation profileLocation = this.location;
        if (profileLocation == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = profileLocation.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode3) * 31) + this.gender.hashCode()) * 31;
        String str2 = this.password;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return hashCode6 + i11;
    }

    public String toString() {
        Integer num = this.allowFollow;
        String str = this.firstName;
        String str2 = this.lastName;
        String str3 = this.profileDob;
        String str4 = this.email;
        ProfileLocation profileLocation = this.location;
        Gender gender = this.gender;
        String str5 = this.password;
        return "EditProfileBody(allowFollow=" + num + ", firstName=" + str + ", lastName=" + str2 + ", profileDob=" + str3 + ", email=" + str4 + ", location=" + profileLocation + ", gender=" + gender + ", password=" + str5 + ")";
    }
}
