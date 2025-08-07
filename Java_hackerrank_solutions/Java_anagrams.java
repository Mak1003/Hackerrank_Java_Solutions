
static boolean isAnagram(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();

    if (a.length() != b.length()) {
        return false;
    }

    char[] aChars = a.toCharArray();
    char[] bChars = b.toCharArray();
    sortCharArray(aChars);
    sortCharArray(bChars);

    for (int i = 0; i < aChars.length; i++) {
        if (aChars[i] != bChars[i]) {
            return false;
        }
    }

    return true;
}

static void sortCharArray(char[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] > arr[j]) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

}
